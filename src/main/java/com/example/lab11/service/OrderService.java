package com.example.lab11.service;

import com.example.lab11.dto.*;
import com.example.lab11.entity.BookEntity;
import com.example.lab11.entity.OrderEntity;
import com.example.lab11.enums.Status;
import com.example.lab11.repository.BookRepo;
import com.example.lab11.repository.LibraryRepo;
import com.example.lab11.repository.OrderRepo;
import com.example.lab11.repository.ReaderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepo orderRepo;
    private final ReaderRepo readerRepo;
    private final LibraryRepo libraryRepo;
    private final BookRepo bookRepo;

    public OrderEntity createOrder(OrderDto orderDto) {
        OrderEntity order = new OrderEntity();

        order.setReader(readerRepo.findById(orderDto.getReader_id()).orElse(null));
        order.setLibrary(libraryRepo.findById(orderDto.getLibrary_id()).orElse(null));
        order.setStatus(Status.valueOf(orderDto.getStatus()));

        // Создаем список книг для заказа
        List<BookEntity> books = new ArrayList<>();
        for (Long bookId : orderDto.getBooks()) {
            BookEntity book = bookRepo.findById(bookId).orElse(null);
            if (book != null) {
                books.add(book);
            }
        }

        // Устанавливаем связь многие ко многим
        order.setBooks(books);

        return orderRepo.save(order);
    }

    public OrderDtoShow showOrder(Long orderId) {
        OrderEntity entity = orderRepo.findById(orderId).orElse(null);
        OrderDtoShow dto = new OrderDtoShow();
        dto.setId(entity.getId());
        dto.setReader(ReaderDto.toDto(entity.getReader()));
        dto.setLibrary(LibraryDto.toDto(entity.getLibrary()));
        dto.setBooks(entity.getBooks().stream()
                .map(BookDto::toDto)
                .collect(Collectors.toList())
        );
        dto.setStatus(entity.getStatus().toString());
        return dto;

    }
}
