package pro.edu.mymysql.controller.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.edu.mymysql.Genre;
import pro.edu.mymysql.CategoryServiceImpl;

import java.util.List;

@RequestMapping("/api/category")
@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl service;

    @GetMapping("/")
    List<Genre> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    Genre get(@PathVariable("id") String id){
        return service.get(id);
    }

    @PostMapping("/")
    Genre create(@RequestBody Genre genre){
        return service.create(genre);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    Genre update(@RequestBody Genre genre){
        return service.create(genre);
    }

    @DeleteMapping("/{id}")
    Genre delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}
/*
* http://localhost:8080/v2/api-docs
* http://localhost:8080/swagger-ui.html
*
*
* */