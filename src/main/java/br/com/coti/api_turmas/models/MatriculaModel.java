package br.com.coti.api_turmas.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_MATRICULA")
public class MatriculaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private TurmaModel turma;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private AlunoModel aluno;

    @Column(nullable = false)
    private Date data;

}
