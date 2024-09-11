package com.revature.jobpostservice.service;

import com.revature.jobpostservice.model.Category;
import com.revature.jobpostservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Service
    public static class CategoryService {
        @Autowired
        private CategoryRepository categoryRepository;

        public List<Category> getAllCategories() {
            return categoryRepository.findAll();
        }

    }
}