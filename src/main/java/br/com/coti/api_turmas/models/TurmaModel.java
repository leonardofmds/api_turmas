package br.com.coti.api_turmas.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Data
@Entity
@Table(name = "TB_TURMA")
public class TurmaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;

    @Column(length = 100, nullable = false)
    public String nome;

    @Column(nullable = false)
    public Date dataInicio;

    @Column(nullable = false)
    public Date dataTermino;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    public ProfessorModel professor;


}
