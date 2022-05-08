package com.everson.compras.service;

import com.everson.compras.entity.Compras;
import com.everson.compras.repository.ComprasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ComprasService {

    @Autowired
    private ComprasRepository comprasRepository;

    public void saveCompras(List<Compras> compras) {
        log.info("Inside saveCompras method of ComprasService");
        comprasRepository.saveAll(compras);
    }

    public List<Compras> findCompras() {
        log.info("Inside saveCompras method of ComprasService");
        return comprasRepository.findAll(Sort.by(Sort.Direction.DESC, "valorTotal"));
    }

}
