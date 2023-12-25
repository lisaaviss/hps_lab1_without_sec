package com.example.lab11.dto;

import com.example.lab11.entity.BookEntity;

import java.util.List;

public class BookDto {
    private Long id;
    private String name;
    private String author;

    private String publication_date;
    private Long library_id;

    private List<Long> orders;


    public static BookDto toDto(BookEntity entity){
        BookDto dto = new BookDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAuthor(entity.getAuthor());
        dto.setPublication_date(entity.getPublication_date());
        dto.setLibrary_id(entity.getLibrary().getId());
        return dto;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public Long getLibrary_id() {
        return library_id;
    }

    public void setLibrary_id(Long library_id) {
        this.library_id = library_id;
    }
}
