package br.com.tiagobarboza.Aula.CRUD.services;

import br.com.tiagobarboza.Aula.CRUD.dto.CategoryDTO;
import br.com.tiagobarboza.Aula.CRUD.entities.Category;
import br.com.tiagobarboza.Aula.CRUD.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> list = new ArrayList<>();
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }
}
