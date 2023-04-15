package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MaquinaModel;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.MaquinaService;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maquina")

public class MaquinaController {
    @Autowired
    MaquinaService maquinaService;

    @GetMapping("/getAll")
    List<MaquinaModel> getAllUser(){
        return maquinaService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MaquinaModel getUserById(@PathVariable("id") long id ){
        return maquinaService.get(id);
    }

    @PostMapping(value = "/create")
    MaquinaModel createUser(@RequestBody MaquinaModel maquinaModel){
        return maquinaService.register(maquinaModel);
    }



    @PutMapping(value = "/update/{id}")
    MaquinaModel updateUserById(@RequestBody MaquinaModel maquinaModel ){
        return maquinaService.update(maquinaModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        maquinaService.delete(id);
    }
}
