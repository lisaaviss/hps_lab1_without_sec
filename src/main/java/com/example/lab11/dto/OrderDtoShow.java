package com.example.lab11.dto;

import java.util.List;

public class OrderDtoShow {
    private Long id;
    private String status;

    private ReaderDto reader;

    private LibraryDto library;

    private List<BookDto> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReaderDto getReader() {
        return reader;
    }

    public void setReader(ReaderDto reader) {
        this.reader = reader;
    }

    public LibraryDto getLibrary() {
        return library;
    }

    public void setLibrary(LibraryDto library) {
        this.library = library;
    }

    public List<BookDto> getBooks() {
        return books;
    }

    public void setBooks(List<BookDto> books) {
        this.books = books;
    }
}
