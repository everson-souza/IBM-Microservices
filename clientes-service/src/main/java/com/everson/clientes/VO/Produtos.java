package com.everson.clientes.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String produto;
    private String variedade;
    private String pais;
    private String categoria;
    private String safra;
    private Float preco;
}
