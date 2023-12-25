package com.example.lab11.controller;

import com.example.lab11.dto.LibraryDto;
import com.example.lab11.dto.ReaderDto;
import com.example.lab11.exception.IncorrectDateFormat;
import com.example.lab11.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/libraries")
public class LibraryController {
    private final LibraryService libraryService;

    @PostMapping
    public ResponseEntity createLibrary(@RequestBody LibraryDto dto) {
        libraryService.createLibrary(dto);
        return ResponseEntity.ok("Библиотека успешно создана");
    }
}
