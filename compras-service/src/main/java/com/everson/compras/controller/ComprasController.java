package com.everson.compras.controller;

import com.everson.compras.entity.Clientes;
import com.everson.compras.entity.Compras;
import com.everson.compras.service.ClientesService;
import com.everson.compras.service.ComprasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    @Autowired
    private ClientesService clientesService;

    // Salvar a lista de compras
    @PostMapping ("/compras")
    public void saveCompras(@RequestBody List<Compras> compras){
        log.info("Inside saveCompras method of ComprasController");
        comprasService.saveCompras(compras);
    }

    // Retornar a lista de compras ordenadas de forma crescente por valor
    @GetMapping("/compras")
    public List<Compras> findCompras(){
        log.info("Inside findComprasById method of ComprasController");
        return comprasService.findCompras();
    }

    // Retornar a maior compra do ano informado com dados da compra
    @GetMapping("/maior-compra/{ano}")
    public Compras maiorCompra(@PathVariable("ano") Integer ano){
        log.info("Inside maiorCompras method of ComprasController");
        return comprasService.maiorCompra(ano);
    }

    // Salvar a lista de clientes
    @PostMapping ("/clientes")
    public void saveClientes(@RequestBody List<Clientes> clientes){
        log.info("ClientesController.saveClientes");
        clientesService.saveClientes(clientes);
    }

    // Retornar a lista de clientes
    @GetMapping("/clientes")
    public List<Clientes> findClientes(){
        log.info("ClientesController.findClientes");
        return clientesService.findClientes();
    }

    // Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    @GetMapping("/clientes-fieis")
    public List<Clientes> getClienteFieis(){
        log.info("ClientesController.getClienteFieis");
        return clientesService.getClientesFieis();
    }
}
