package com.everson.compras.service;

import com.everson.compras.entity.Clientes;
import com.everson.compras.repository.ClientesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    // Salvar a lista de clientes
    public void saveClientes(List<Clientes> clientes) {
        log.info("ClientesService.saveClientes");
        clientesRepository.saveAll(clientes);
    }

    //  Retornar a lista de clientes
    public List<Clientes> findClientes() {
        log.info("ClientesService.findClientes");
        return clientesRepository.findAll();
    }

    //  Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    public List<Clientes> getClientesFieis() {
        log.info("ClientesService.getClienteCompras");

        int page = 0, size = 3;

        Pageable pageable = PageRequest.of(page, size);
        return clientesRepository.findTop3Clientes(pageable);

    }
}
