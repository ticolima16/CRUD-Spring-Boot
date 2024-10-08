package br.com.tiagobarboza.Aula.CRUD.repositories;

import br.com.tiagobarboza.Aula.CRUD.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
