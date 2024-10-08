package br.com.tiagobarboza.Aula.CRUD.services;

import br.com.tiagobarboza.Aula.CRUD.entities.Category;
import br.com.tiagobarboza.Aula.CRUD.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
