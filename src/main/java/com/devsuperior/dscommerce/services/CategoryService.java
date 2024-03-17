package com.devsuperior.dscommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.CategoryDTO;
import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.repositories.CategoryRepository;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {

	
	@Autowired 
	CategoryRepository categoryRepository;


	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Category category = categoryRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new CategoryDTO(category);
	}

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> result = categoryRepository.findAll();
		return result.stream().map(x -> new CategoryDTO(x)).toList();
	}

	

}
