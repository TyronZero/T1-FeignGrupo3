package com.cibertec.T1_FeignGrupo3.brewery.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.cibertec.T1_FeignGrupo3.brewery.restclient.iclient.BreweryClient;
import com.cibertec.T1_FeignGrupo3.brewery.restclient.model.BreweryData;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BreweryService {
    private static final String BREWERY_TYPE = "micro";
    private static final String STATE = "California";

    private final BreweryClient breweryClient;

    public List<BreweryData> getMicroBreweriesInCalifornia() {
        return breweryClient.getBreweries().stream()
                .filter(brewery -> BREWERY_TYPE.equalsIgnoreCase(brewery.getBrewery_type()))
                .filter(brewery -> STATE.equalsIgnoreCase(brewery.getState()))
                .toList();

    }
}
