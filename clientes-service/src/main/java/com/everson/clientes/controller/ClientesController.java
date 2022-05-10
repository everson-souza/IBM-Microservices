package com.everson.clientes.controller;

import com.everson.clientes.VO.ResponseTemplateVO;
import com.everson.clientes.entity.Clientes;
import com.everson.clientes.service.ClientesService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class ClientesController {

    @Autowired

    private ClientesService clientesService;

    @PostMapping ("/clientes")
    public void saveClientes(@RequestBody List<Clientes> clientes){
        log.info("Inside saveClientes method of ClientesController");
        clientesService.saveClientes(clientes);
    }

    @GetMapping("/clientes")
    public List<Clientes> findClientes(){
        log.info("Inside findClientes method of ComprasController");
        return clientesService.findClientes();
    }

    @GetMapping("/clientes-fieis")
    public List<Clientes> getClienteCompras(){
        log.info("Inside getClienteCompras method of ComprasController");
        return clientesService.getClientesFieis();
    }


}
