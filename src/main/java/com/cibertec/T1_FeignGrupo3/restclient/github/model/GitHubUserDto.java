package com.cibertec.T1_FeignGrupo3.restclient.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubUserDto {
  private Long id;
  private String login;
  private Boolean site_admin;
  private String avatar_url;
}
