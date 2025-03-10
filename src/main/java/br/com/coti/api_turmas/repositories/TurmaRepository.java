package br.com.coti.api_turmas.repositories;

import br.com.coti.api_turmas.models.TurmaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TurmaRepository extends JpaRepository<TurmaModel, UUID> {
}
