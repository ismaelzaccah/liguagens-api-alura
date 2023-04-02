package com.br.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LinguagemController {

  @Autowired
  private LinguagemRepository repositorio;

  @GetMapping("/lang") public List<Linguagem> obterLinguagens() {
    return repositorio.findAll();
  }

  @PostMapping("/lang")
  public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
      Linguagem linguagemSalva = repositorio.save(linguagem);
      return linguagemSalva;
  }
  
}
