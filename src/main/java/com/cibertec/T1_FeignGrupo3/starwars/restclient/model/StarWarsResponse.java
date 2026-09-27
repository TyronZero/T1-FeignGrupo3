package com.cibertec.T1_FeignGrupo3.starwars.restclient.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StarWarsResponse {
    private List<StarWarsCharacter> results;
}
