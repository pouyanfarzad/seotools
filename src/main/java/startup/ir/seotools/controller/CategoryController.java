package startup.ir.seotools.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import startup.ir.seotools.repository.CategoryRepository;

@RestController
public class CategoryController {


    @Autowired
    private CategoryRepository categoryRepository;

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping(value = "/category")
    public String category(){
        return new Gson().toJson(categoryRepository.findAll());
    }

}
