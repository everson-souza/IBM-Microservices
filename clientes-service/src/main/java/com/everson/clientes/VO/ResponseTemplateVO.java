package com.everson.clientes.VO;

import com.everson.clientes.entity.Clientes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Clientes clientes;

    private Compras compras;
}
