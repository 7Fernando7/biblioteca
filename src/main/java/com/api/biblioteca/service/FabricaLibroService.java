package com.api.biblioteca.service;

import com.api.biblioteca.dto.LibroDTO;
import com.api.biblioteca.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaLibroService {
    public Libro crearLibro(LibroDTO libroDTO){
        return new Libro(libroDTO);
    }

    public LibroDTO crearLibroDTO(Libro libro){
        return new LibroDTO(libro);
    }

    public List<LibroDTO> crearLibrosDTO (List<Libro> listaLibros){
        List<LibroDTO> libroDTOS = new ArrayList<>();
        listaLibros.stream().forEach(
                libro -> {
                    libroDTOS.add(crearLibroDTO(libro));
                } );
        return libroDTOS;
    }
}

