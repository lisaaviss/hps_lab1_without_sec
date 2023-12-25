package com.example.lab11.service;

import com.example.lab11.dto.BookDto;
import com.example.lab11.entity.BookEntity;
import com.example.lab11.entity.LibraryEntity;
import com.example.lab11.exception.IncorrectDateFormat;
import com.example.lab11.repository.BookRepo;
import com.example.lab11.repository.LibraryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepo bookRepo;
    private final LibraryRepo libraryRepo;

    public void  createBook(BookDto dto) throws IncorrectDateFormat {
        BookEntity entity = new BookEntity();
        entity.setName(dto.getName());
        entity.setAuthor(dto.getAuthor());
        String publicdayString = dto.getPublication_date();
        try {
            LocalDate.parse(publicdayString);
            entity.setPublication_date(publicdayString);
        }catch (DateTimeParseException e) {
            throw new IncorrectDateFormat("Введена неправильная дата, дата должна быть формата yyyy-mm-dd");
        }
        LibraryEntity libraryEntity = libraryRepo.findById(dto.getLibrary_id()).orElse(null);
        entity.setLibrary(libraryEntity);
        bookRepo.save(entity);
    }
}
