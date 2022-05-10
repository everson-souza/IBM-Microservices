package com.everson.compras.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
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

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date data;

    private Integer cliente;

    private Float valorTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produtos> itens;

}
