package com.cibertec.T1_FeignGrupo3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.T1_FeignGrupo3.restclient.github.model.GitHubUserDto;
import com.cibertec.T1_FeignGrupo3.service.GitHubService;

import java.util.List;

@RestController
@RequestMapping("/api/github")
@RequiredArgsConstructor
public class GitHubController {

  private final GitHubService gitHubService;

  @GetMapping("/filtered-users")
  public List<GitHubUserDto> getFilteredUsers() {
    return gitHubService.getFilteredUsers();
  }
}
