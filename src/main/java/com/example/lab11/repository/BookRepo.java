package com.example.lab11.repository;

import com.example.lab11.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<BookEntity, Long> {

}
