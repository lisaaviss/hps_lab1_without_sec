package com.example.lab11.service;

import com.example.lab11.dto.LibraryDto;
import com.example.lab11.entity.LibraryEntity;
import com.example.lab11.repository.LibraryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LibraryService {

    public final LibraryRepo libraryRepo;

    public void createLibrary(LibraryDto dto){
        LibraryEntity entity = new LibraryEntity();
        entity.setName(dto.getName());
        libraryRepo.save(entity);
    }
}
