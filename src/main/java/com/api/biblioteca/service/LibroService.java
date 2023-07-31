package com.api.biblioteca.service;

import com.api.biblioteca.dto.LibroDTO;
import com.api.biblioteca.model.Autor;
import com.api.biblioteca.repository.AutorRepository;
import com.api.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private FabricaLibroService fabricaLibroService;
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private FabricaAutorService fabricaAutorService;

    public LibroDTO save(LibroDTO libroDTO){
        //Buscar autor
       Autor autor = autorRepository.findById(libroDTO.getIdAutor()).get();
       libroDTO.setAutorDTO((fabricaAutorService.crearAutorDTO(autor)));
        return fabricaLibroService.crearLibroDTO(libroRepository.save(fabricaLibroService.crearLibro(libroDTO)));
    }

    public List<LibroDTO> findAll(){ return fabricaLibroService.crearLibrosDTO(libroRepository.findAll()); }

    public LibroDTO findById(Integer id) {
        return fabricaLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        libroRepository.deleteById(id);
    }
}
