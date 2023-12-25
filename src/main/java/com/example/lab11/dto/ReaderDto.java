package com.example.lab11.dto;

import com.example.lab11.entity.ReaderEntity;

import java.util.Collection;
public class ReaderDto {
    private Long id;
    private String name;
    private String birthday;

    private Long library_id;


    public ReaderDto(){

    }
    public static ReaderDto toDto(ReaderEntity entity){
        ReaderDto dto =new ReaderDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBirthday(entity.getBirthday());
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getLibrary_id() {
        return library_id;
    }

    public void setLibrary_id(Long library_id) {
        this.library_id = library_id;
    }

}
