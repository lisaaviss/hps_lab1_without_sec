package com.example.lab11.service;
import com.example.lab11.dto.ReaderDto;
import com.example.lab11.entity.LibraryEntity;
import com.example.lab11.entity.ReaderEntity;
import com.example.lab11.exception.IncorrectDateFormat;
import com.example.lab11.repository.LibraryRepo;
import com.example.lab11.repository.ReaderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@RequiredArgsConstructor
@Service
public class ReaderService {
    private final ReaderRepo readerRepo;
    private final LibraryRepo libraryRepo;
    public void createReader(ReaderDto dto) throws IncorrectDateFormat {
        ReaderEntity entity = new ReaderEntity();
        entity.setName(dto.getName());
        String birthdayString = dto.getBirthday();
        try {
            LocalDate.parse(birthdayString);
            entity.setBirthday(birthdayString);
        }catch (DateTimeParseException e) {
            throw new IncorrectDateFormat("Введена неправильная дата, дата должна быть формата yyyy-mm-dd");
        }
        LibraryEntity libraryEntity = libraryRepo.findById(dto.getLibrary_id()).orElse(null);
        entity.setLibrary(libraryEntity);
        readerRepo.save(entity);
    }

    public ReaderDto showReader(Long reader_id){
        ReaderEntity entity = readerRepo.findById(reader_id).orElse(null);
        ReaderDto dto = new ReaderDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBirthday(entity.getBirthday());
        dto.setLibrary_id(entity.getLibrary().getId());
        return dto;
    }
}
