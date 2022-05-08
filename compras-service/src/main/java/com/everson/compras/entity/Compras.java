package com.everson.compras.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigo;

    private String data;

    private String cliente;

    private Float valorTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produtos> itens;

}
