package com.decus.laboratorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decus.laboratorio.service.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
  
  @Autowired
  private AlunoService service;

  @GetMapping("/show")
  public ResponseEntity<?> teste() {
    return ResponseEntity.status(HttpStatus.OK).body(service.teste());
  }
  
}
