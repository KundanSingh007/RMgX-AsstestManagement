package com.RMgX.kundansingh.controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    private static final String CategoryEntityService = null;
	@Autowired
    private Category CategoryService;

    @GetMapping("/Category")
    public ResponseEntity < List < Category >> getAllCategory() {
        return ResponseEntity.ok().body(CategoryEntityService.getAllByCategory());
    }
    
   

    @GetMapping("/Category/{id}")
    public ResponseEntity < Category > getProductById(@PathVariable long id) {
        return ResponseEntity.ok().body(CategoryService.getAllCategoryById(id));
    }

    @PostMapping("/Category")
    public ResponseEntity < Category > createCategory(@RequestBody Category category) {
        return ResponseEntity.ok().body(this.CategoryService.createCategory(CategoryService));
    }

    @PutMapping("/Category/{id}")
    public ResponseEntity < Category > updateProduct(@PathVariable long id, @RequestBody Category Category) {
    	CategoryService.setId(id);
        return ResponseEntity.ok().body(this.CategoryService.CategoryUpdate(Category));
    }

    @DeleteMapping("/Category/{id}")
    public HttpStatus deleteCategory(@PathVariable long id) {
        this.CategoryService.deleteCategory(id);
        return HttpStatus.OK;
    }
}