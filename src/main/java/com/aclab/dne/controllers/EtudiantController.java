package com.aclab.dne.controllers;

import com.aclab.dne.converter.EtudiantConverter;
import com.aclab.dne.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/etudiants")
public class EtudiantController {

    private final EtudiantConverter etudiantConverter;
    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantController(EtudiantConverter etudiantConverter, EtudiantRepository etudiantRepository) {
        this.etudiantConverter = etudiantConverter;
        this.etudiantRepository = etudiantRepository;
    }
}