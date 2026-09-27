package com.cibertec.T1_FeignGrupo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo3Application {

  public static void main(String[] args) {
    SpringApplication.run(T1FeignGrupo3Application.class, args);
  }

}
