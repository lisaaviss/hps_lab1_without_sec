package com.example.lab11.entity;

import com.example.lab11.enums.Status;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private ReaderEntity reader;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private LibraryEntity library;

    @ManyToMany
    @JoinTable(
            name = "book_order",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<BookEntity> books;


    @Enumerated(EnumType.STRING)
    private Status status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReaderEntity getReader() {
        return reader;
    }

    public void setReader(ReaderEntity reader) {
        this.reader = reader;
    }

    public LibraryEntity getLibrary() {
        return library;
    }

    public void setLibrary(LibraryEntity library) {
        this.library = library;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
