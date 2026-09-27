package com.cibertec.T1_FeignGrupo3.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.cibertec.T1_FeignGrupo3.restclient.config.FeignConfig;
import com.cibertec.T1_FeignGrupo3.restclient.placeholder.model.BreweryData;

import java.util.List;

@FeignClient(name = "breweryClient", url = "https://api.openbrewerydb.org", configuration = FeignConfig.class)
public interface BreweryClient {
    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
