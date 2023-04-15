package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MetaModel;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.MetaService;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meta")

public class MetaController {
    @Autowired
    MetaService metaService;

    @GetMapping("/getAll")
    List<MetaModel> getAllUser(){
        return metaService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MetaModel getUserById(@PathVariable("id") long id ){
        return metaService.get(id);
    }

    @PostMapping(value = "/create")
    MetaModel createUser(@RequestBody MetaModel metaModel){
        return metaService.register(metaModel);
    }

    @PutMapping(value = "/update/{id}")
    MetaModel updateUserById(@RequestBody MetaModel metaModel){
        return metaService.update(metaModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        metaService.delete(id);
    }
}
