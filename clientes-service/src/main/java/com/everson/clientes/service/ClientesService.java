package com.everson.clientes.service;

import com.everson.clientes.entity.Clientes;
import com.everson.clientes.repository.ClientesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;


    //  Salvar a lista de clientes
    public void saveClientes(List<Clientes> clientes) {
        log.info("ClientesService.saveClientes");
        clientesRepository.saveAll(clientes);
    }

    //  Retornar a lista de clientes
    public List<Clientes> findClientes() {
        log.info("ClientesService.findClientes");
        return clientesRepository.findAll();
    }

}
