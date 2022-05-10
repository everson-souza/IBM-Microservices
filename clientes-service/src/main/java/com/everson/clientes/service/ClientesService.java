package com.everson.clientes.service;

import com.everson.clientes.VO.Compras;
import com.everson.clientes.VO.ResponseTemplateVO;
import com.everson.clientes.entity.Clientes;
import com.everson.clientes.repository.ClientesRepository;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private RestTemplate restTemplate;

    public void saveClientes(List<Clientes> clientes) {
        log.info("Inside saveCompras method of ComprasService");
        clientesRepository.saveAll(clientes);
    }

    public List<Clientes> findClientes() {
        log.info("Inside findClientes method of ComprasService");
        return clientesRepository.findAll();
    }

    public List<Clientes> getClientesFieis() {
        log.info("Inside getClienteCompras method of ClientesService");

        Compras compras = restTemplate.getForObject("http://localhost:9001/compras/", Compras.class);
        return clientesRepository.findTop3Clientes();

    }
}
