package com.api.biblioteca.controller;

import com.api.biblioteca.dto.AutorDTO;
import com.api.biblioteca.dto.LibroDTO;
import com.api.biblioteca.model.Libro;
import com.api.biblioteca.service.AutorService;
import com.api.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")

public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<LibroDTO> save(@RequestBody LibroDTO libroDTO) {
        return new ResponseEntity<>(libroService.save(libroDTO), HttpStatus.CREATED);
    }
}
