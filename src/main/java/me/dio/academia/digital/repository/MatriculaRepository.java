package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /*
        Uma outra forma de fazer consultas usando o SQL:
        @Query(value = "SELECT * FROM tb_matriculas m " +
                   "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
                   "WHERE a.bairro = :bairro", nativeQuery = true)
     */
    List<Matricula> findByAlunoBairro(String bairro);
}
