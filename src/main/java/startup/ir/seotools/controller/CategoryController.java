package startup.ir.seotools.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @GetMapping(value = "/category")
    public String firstRest(){
        return "Categories";
    }


}
