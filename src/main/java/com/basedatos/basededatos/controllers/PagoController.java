package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.PagoModel;
import com.basedatos.basededatos.models.VentasModel;
import com.basedatos.basededatos.services.PagoService;
import com.basedatos.basededatos.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")

public class PagoController {
    @Autowired
    PagoService pagoService;

    @GetMapping("/getAll")
    List<PagoModel> getAllUser(){
        return pagoService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    PagoModel getUserById(@PathVariable("id") long id ){
        return pagoService.get(id);
    }

    @PostMapping(value = "/create")
    PagoModel createUser(@RequestBody PagoModel pagoModel){
        return pagoService.register(pagoModel);
    }



    @PutMapping(value = "/update/{id}")
    PagoModel updateUserById(@RequestBody PagoModel pagoModel ){
        return pagoService.update(pagoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        pagoService.delete(id);
    }
}
