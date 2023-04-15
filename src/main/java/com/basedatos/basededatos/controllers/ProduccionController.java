package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProduccionModel;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.ProduccionService;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produccion")

public class ProduccionController {
    @Autowired
    ProduccionService produccionService;

    @GetMapping("/getAll")
    List<ProduccionModel> getAllUser(){
        return produccionService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProduccionModel getUserById(@PathVariable("id") long id ){
        return produccionService.get(id);
    }

    @PostMapping(value = "/create")
    ProduccionModel createUser(@RequestBody ProduccionModel produccionModel){
        return produccionService.register(produccionModel);
    }



    @PutMapping(value = "/update/{id}")
    ProduccionModel updateUserById(@RequestBody ProduccionModel produccionModel ){
        return produccionService.update(produccionModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        produccionService.delete(id);
    }
}
