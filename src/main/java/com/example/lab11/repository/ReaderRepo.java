package com.example.lab11.repository;

import com.example.lab11.entity.ReaderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepo extends CrudRepository<ReaderEntity, Long> {
}
