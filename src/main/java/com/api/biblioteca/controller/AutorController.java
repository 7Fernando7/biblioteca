package com.api.biblioteca.controller;

import com.api.biblioteca.dto.AutorDTO;
import com.api.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/biblioteca/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO autorDTO) {
        return new ResponseEntity<>(autorService.save(autorDTO), HttpStatus.CREATED);
    }

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<AutorDTO>> findAll() {
        return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<AutorDTO> findById(@PathVariable Integer id){
        try{
            return new ResponseEntity<>(autorService.findById(id), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletarPorId/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id) {
        try{
            autorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
