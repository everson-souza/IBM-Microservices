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

    // Salvar a lista de compras
    public void saveCompras(List<Compras> compras) {
        log.info("ComprasService.saveCompras");
        comprasRepository.saveAll(compras);
    }

    // Retornar a lista de compras ordenadas de forma crescente por valor
    public List<Compras> findCompras() {
        log.info("ComprasService.findCompras");
        return comprasRepository.findAll(Sort.by(Sort.Direction.DESC, "valorTotal"));
    }

    //  Retornar a maior compra do ano informado com dados da compra
    public Compras maiorCompra(Integer ano) {
        log.info("ComprasService.maiorCompra");
        return comprasRepository.maiorCompra(ano);
    }
}
