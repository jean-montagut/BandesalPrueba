package com.example.bandesal.bandesal.dto;

import lombok.*;

/*
    Clase DTO para la entidad readers
    Author: jmontagut
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadersDto{

    private Integer idReaders;

    private String namw;


    @Override
    public String toString() {
        return "com.dto.ReadersDto[id=" + idReaders + "]";
    }
}
