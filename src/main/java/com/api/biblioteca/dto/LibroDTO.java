package com.api.biblioteca.dto;

import com.api.biblioteca.model.Autor;
import com.api.biblioteca.model.Libro;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Repository
@NoArgsConstructor
public class LibroDTO {

    private Integer id;
    private String isbn;
    private String nombre;
    private String editorial;
    private String genero;
    private int numeroPaginas;
    private BigDecimal precio;
    private LocalDate fechaEdiicion;
    private AutorDTO autorDTO;
    private Integer idAutor;


    public LibroDTO(Libro libro) {
        this.id = id;
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.fechaEdiicion = fechaEdiicion;
        this.autorDTO = autorDTO;
    }
}
