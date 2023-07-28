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

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.isbn = libro.getIsbn();
        this.nombre = libro.getNombre();
        this.editorial = libro.getEditorial();
        this.genero = libro.getGenero();
        this.numeroPaginas = libro.getNumeroPaginas();
        this.precio = libro.getPrecio();
        this.fechaEdiicion = libro.getFechaEdiicion();
        this.autorDTO = new AutorDTO(libro.getAutor());
    }

}
