package com.cibertec.T1_FeignGrupo3.restclient.brewery.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.cibertec.T1_FeignGrupo3.restclient.brewery.model.BreweryData;

import java.util.List;

@FeignClient(name = "breweryClient", url = "https://api.openbrewerydb.org")
public interface BreweryClient {
    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
