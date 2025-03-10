package br.com.coti.api_turmas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_MATRICULA")
public class MatriculaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private TurmaModel turma;
    private AlunoModel aluno;

}
