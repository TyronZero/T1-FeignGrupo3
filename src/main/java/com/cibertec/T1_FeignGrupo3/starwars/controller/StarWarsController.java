package com.cibertec.T1_FeignGrupo3.starwars.controller;

import com.cibertec.T1_FeignGrupo3.starwars.restclient.model.StarWarsCharacter;
import com.cibertec.T1_FeignGrupo3.starwars.service.StarWarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StarWarsController {

    private final StarWarsService starWarsService;

    @GetMapping("/starwars/characters")
    public List<StarWarsCharacter> getCharacters() {
        return starWarsService.getFilteredCharacters();
    }
}