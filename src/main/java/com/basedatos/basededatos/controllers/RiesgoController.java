package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.models.RiesgoModel;
import com.basedatos.basededatos.services.ProductoService;
import com.basedatos.basededatos.services.RiesgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/riesgo")

public class RiesgoController {
    @Autowired
    RiesgoService riesgoService;

    @GetMapping("/getAll")
    List<RiesgoModel> getAllUser(){
        return riesgoService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    RiesgoModel getUserById(@PathVariable("id") long id ){
        return riesgoService.get(id);
    }

    @PostMapping(value = "/create")
    RiesgoModel createUser(@RequestBody RiesgoModel riesgoModel){
        return riesgoService.register(riesgoModel);
    }

    @PutMapping(value = "/update/{id}")
    RiesgoModel updateUserById(@RequestBody RiesgoModel riesgoModel ){
        return riesgoService.update(riesgoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        riesgoService.delete(id);
    }
}
