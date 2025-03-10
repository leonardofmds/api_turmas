package br.com.coti.api_turmas.controllers;

import br.com.coti.api_turmas.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;



}
