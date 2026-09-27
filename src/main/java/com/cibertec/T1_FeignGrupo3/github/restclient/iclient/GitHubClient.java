package com.cibertec.T1_FeignGrupo3.github.restclient.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.T1_FeignGrupo3.github.restclient.model.GitHubUserDto;

import java.util.List;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

  @GetMapping("/users")
  List<GitHubUserDto> getUsers();
}
