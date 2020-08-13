package pro.edu.mymysql.controller.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.edu.mymysql.Genre;
import pro.edu.mymysql.CategoryServiceImpl;

import java.util.List;

@RequestMapping("/api/category")
@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl service;

    @RequestMapping("/get/list")
    List<Genre> getAll(){
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Genre get(@PathVariable("id") String id){
        return service.get(id);
    }
}
