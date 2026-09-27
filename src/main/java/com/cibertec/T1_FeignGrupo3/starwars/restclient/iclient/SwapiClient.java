package com.cibertec.T1_FeignGrupo3.starwars.restclient.iclient;

import com.cibertec.T1_FeignGrupo3.starwars.restclient.model.StarWarsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "swapiClient", url = "https://swapi.dev")
public interface SwapiClient {

    @GetMapping("/api/people/")
    StarWarsResponse getCharacters();
}
