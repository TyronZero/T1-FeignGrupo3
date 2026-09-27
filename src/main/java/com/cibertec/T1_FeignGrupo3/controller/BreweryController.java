package com.cibertec.T1_FeignGrupo3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.T1_FeignGrupo3.restclient.brewery.model.BreweryData;
import com.cibertec.T1_FeignGrupo3.service.BreweryService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/brewery-client")
@RestController
public class BreweryController {
    private final BreweryService breweryService;

    @GetMapping
    public ResponseEntity<List<BreweryData>> getMicroBreweriesInCalifornia() {
        return ResponseEntity.ok(breweryService.getMicroBreweriesInCalifornia());
    }
}
