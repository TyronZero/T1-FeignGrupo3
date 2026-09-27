package com.cibertec.T1_FeignGrupo3.restclient.github.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.T1_FeignGrupo3.restclient.github.model.GitHubUserDto;

import java.util.List;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

  @GetMapping("/users")
  List<GitHubUserDto> getUsers();
}
