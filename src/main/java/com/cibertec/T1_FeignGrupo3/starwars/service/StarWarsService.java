package com.cibertec.T1_FeignGrupo3.starwars.service;

import com.cibertec.T1_FeignGrupo3.starwars.restclient.iclient.SwapiClient;
import com.cibertec.T1_FeignGrupo3.starwars.restclient.model.StarWarsCharacter;
import com.cibertec.T1_FeignGrupo3.starwars.restclient.model.StarWarsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StarWarsService {

    private final SwapiClient swapiClient;

    public List<StarWarsCharacter> getFilteredCharacters() {
        StarWarsResponse response = swapiClient.getCharacters();

        return response.getResults().stream()
                .filter(character -> "female".equals(character.getGender()))
                .filter(character -> hasRequiredHeight(character.getHeight()))
                .toList();
    }

    private boolean hasRequiredHeight(String height) {
        if (height == null) {
            return false;
        }

        try {
            return Integer.parseInt(height.trim()) > 160;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}