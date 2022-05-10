package com.everson.clientes.VO;

import com.everson.clientes.entity.Clientes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Clientes clientes;

    @OneToMany
    private Compras compras;
}
