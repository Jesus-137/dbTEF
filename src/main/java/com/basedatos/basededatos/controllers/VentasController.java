package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.models.VentasModel;
import com.basedatos.basededatos.services.UserService;
import com.basedatos.basededatos.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")

public class VentasController {
    @Autowired
    VentasService ventasService;

    @GetMapping("/getAll")
    List<VentasModel> getAllUser(){
        return ventasService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    VentasModel getUserById(@PathVariable("id") long id ){
        return ventasService.get(id);
    }

    @PostMapping(value = "/create")
    VentasModel createUser(@RequestBody VentasModel ventasModel){
        return ventasService.register(ventasModel);
    }



    @PutMapping(value = "/update/{id}")
    VentasModel updateUserById(@RequestBody VentasModel ventasModel ){
        return ventasService.update(ventasModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        ventasService.delete(id);
    }
}
