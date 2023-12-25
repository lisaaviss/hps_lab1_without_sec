package com.example.lab11.dto;

import com.example.lab11.enums.Status;

import java.util.List;

public class OrderDto {
    private Long id;
    private Long reader_id;

    private Long library_id;
    private List<Long> books;
    private String status;


    public ReaderDto readerDto;

    public LibraryDto libraryDto;

    public List<BookDto> booksDto;

    public List<BookDto> getBooksDto() {
        return booksDto;
    }

    public void setBooksDto(List<BookDto> booksDto) {
        this.booksDto = booksDto;
    }

    public LibraryDto getLibraryDto() {
        return libraryDto;
    }

    public void setLibraryDto(LibraryDto libraryDto) {
        this.libraryDto = libraryDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReader_id() {
        return reader_id;
    }

    public void setReader_id(Long reader_id) {
        this.reader_id = reader_id;
    }

    public Long getLibrary_id() {
        return library_id;
    }

    public void setLibrary_id(Long library_id) {
        this.library_id = library_id;
    }

    public List<Long> getBooks() {
        return books;
    }

    public void setBooks(List<Long> books) {
        this.books = books;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReaderDto getReaderDto() {
        return readerDto;
    }

    public void setReaderDto(ReaderDto readerDto) {
        this.readerDto = readerDto;
    }
}
