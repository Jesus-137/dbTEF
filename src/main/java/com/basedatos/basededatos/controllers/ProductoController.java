package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")

public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/getAll")
    List<ProductoModel> getAllUser(){
        return productoService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProductoModel getUserById(@PathVariable("id") long id ){
        return productoService.get(id);
    }

    @PostMapping(value = "/create")
    ProductoModel createUser(@RequestBody ProductoModel productoModel){
        return productoService.register(productoModel);
    }



    @PutMapping(value = "/update/{id}")
    ProductoModel updateUserById(@RequestBody ProductoModel productoModel ){
        return productoService.update(productoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        productoService.delete(id);
    }
}
