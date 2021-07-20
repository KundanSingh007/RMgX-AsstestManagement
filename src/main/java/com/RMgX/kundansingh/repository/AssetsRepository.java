package com.RMgX.kundansingh.repository;

import java.util.List;
import java.util.Locale.Category;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.kundansingh.Entity.AssetsEntity;
import com.RMgX.kundansingh.Entity.CategoryEntity;

@Repository
public interface AssetsRepository extends CrudRepository <AssetsEntity, Long>{

	void deleteById(CategoryEntity categoryEntity);

	void deleteById(AssetsEntity assetsEntity);

	Category saveAll(AssetsEntity assets);

	List<Category> findAllById();

	
}


