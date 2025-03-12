package br.com.coti.api_turmas.controllers;

import br.com.coti.api_turmas.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @PostMapping("/cadastrar")
    public void cadastrarAluno() {

    }


}
