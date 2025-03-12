package br.com.coti.api_turmas.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ALUNOS")
public class AlunoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false, unique = true)
    private Integer matricula;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

}
