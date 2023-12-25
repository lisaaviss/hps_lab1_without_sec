package com.example.lab11.dto;

import com.example.lab11.entity.LibraryEntity;

public class LibraryDto {
    private Long id;
    private String name;

    public static LibraryDto toDto(LibraryEntity entity){
        LibraryDto dto = new LibraryDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
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
}
