package br.com.coti.api_turmas.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PROFESSOR")
public class ProfessorModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;

    @Column(length = 100, nullable = false)
    public String nome;

    @Column(length = 11, nullable = false)
    public String telefone;

}

