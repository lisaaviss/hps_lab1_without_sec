package com.example.lab11.controller;
import com.example.lab11.dto.BookDto;
import com.example.lab11.exception.IncorrectDateFormat;
import com.example.lab11.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    @PostMapping
    public ResponseEntity createReader(@RequestBody BookDto dto) {
        try {
            bookService.createBook(dto);
            return ResponseEntity.ok("Книга успешно создана");
        } catch (IncorrectDateFormat e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }


}
