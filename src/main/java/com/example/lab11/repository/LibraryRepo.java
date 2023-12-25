package com.example.lab11.repository;

import com.example.lab11.entity.LibraryEntity;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepo extends CrudRepository<LibraryEntity, Long> {

}
