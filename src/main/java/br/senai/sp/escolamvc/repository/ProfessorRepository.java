package br.senai.sp.escolamvc.repository;

import br.senai.sp.escolamvc.model.Aluno;
import br.senai.sp.escolamvc.model.Professor;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findProfessorsByNomeContaining(@NotEmpty(message = "O campo Nome deve ser preenchido!") String nome);
    Professor findProfessorByCpf(String cpf);
}


