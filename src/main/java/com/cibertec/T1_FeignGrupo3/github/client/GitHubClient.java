package com.cibertec.T1_FeignGrupo3.github.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.T1_FeignGrupo3.github.dto.GitHubUserDto;

import java.util.List;

@FeignClient(name = "githubClient", url = "https://api.github.com")
public interface GitHubClient {

  @GetMapping("/users")
  List<GitHubUserDto> getUsers();
}
