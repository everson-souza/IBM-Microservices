package com.everson.clientes.service;

import com.everson.clientes.entity.Clientes;
import com.everson.clientes.repository.ClientesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public void saveClientes(List<Clientes> clientes) {
        log.info("Inside saveCompras method of ComprasService");
        clientesRepository.saveAll(clientes);
    }

    public List<Clientes> findTop3Clientes() {
        log.info("Inside findClientes method of ClientesService");
        return clientesRepository.findTop3Clientes();
    }
}
