package com.api.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Autor {
    private Integer id;
    private String nombres;
    private String Apellidos;
    private String telefono;
}
