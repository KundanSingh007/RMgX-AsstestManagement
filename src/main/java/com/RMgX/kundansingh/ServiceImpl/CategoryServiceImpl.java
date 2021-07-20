package com.RMgX.kundansingh.ServiceImpl;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.RMgX.kundansingh.Entity.CategoryEntity;
import com.RMgX.kundansingh.repository.CategoryRepository;
import com.RMgX.kundansingh.service.CategoryEntityService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryEntityService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.saveAll(category);
	}

	@SuppressWarnings("static-access")
	@Override
	public Category updateCategory(Category category) {
		Optional<Category> CategoryDb = this.categoryRepository.findById(category.getId());

		if (CategoryDb.isPresent()) {
			Category categoryUpdate = CategoryDb.get();
			categoryUpdate.setId(category.getid());
			categoryUpdate.setName(category.name());
			categoryUpdate.setDescription(Category.getDescription());
			categoryRepository.save(categoryUpdate);
			return categoryUpdate;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + Category.getId());
		}
	}

	@Override
	public List<Category> getAllCategory() {
		return this.categoryRepository.findAllById();
	}

	@Override
	public CategoryEntity getCategoryById(long CategoryId) {

		Optional<CategoryEntity> CategoryDb = this.categoryRepository.findById(CategoryId);

		if (CategoryDb.isPresent()) {
			return CategoryDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + CategoryId);
		}
	}

	@Override
	public void deleteCategory(long CategoryId) {
		Optional<CategoryEntity> CategoryDb = this.categoryRepository.findById(CategoryId);

		if (CategoryDb.isPresent()) {
			this.categoryRepository.deleteById(CategoryDb.get());
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + CategoryId);
		}

	}
}