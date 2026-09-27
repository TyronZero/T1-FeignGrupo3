package com.cibertec.T1_FeignGrupo3.github.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.cibertec.T1_FeignGrupo3.github.restclient.iclient.GitHubClient;
import com.cibertec.T1_FeignGrupo3.github.restclient.model.GitHubUserDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GitHubService {

  private final GitHubClient gitHubClient;

  public List<GitHubUserDto> getFilteredUsers() {
    List<GitHubUserDto> users = gitHubClient.getUsers();

    return users.stream()
        .filter(user -> user.getLogin() != null && user.getLogin().length() <= 5)
        .filter(user -> Boolean.FALSE.equals(user.getSite_admin()))
        .toList();
  }
}
