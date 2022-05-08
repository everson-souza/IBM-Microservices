package com.everson.compras.controller;

import com.everson.compras.entity.Compras;
import com.everson.compras.service.ComprasService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    @PostMapping ("/compras")
    public void saveCompras(@RequestBody List<Compras> compras){
        log.info("Inside saveCompras method of ComprasController");
        comprasService.saveCompras(compras);
    }

    @GetMapping("/compras")
    public List<Compras> findCompras(){
        log.info("Inside findComprasById method of ComprasController");
        return comprasService.findCompras();
    }
}
