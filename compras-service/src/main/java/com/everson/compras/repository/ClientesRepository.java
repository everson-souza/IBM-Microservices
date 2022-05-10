package com.everson.compras.repository;

import com.everson.compras.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String> {

    //Retornar o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.
    @Query("SELECT cli from Clientes cli inner join Compras com on com.cliente = cli.id group by com.cliente order by sum(com.valorTotal), count(com) desc")
    List<Clientes> findTop3Clientes(Pageable pageable);

}
