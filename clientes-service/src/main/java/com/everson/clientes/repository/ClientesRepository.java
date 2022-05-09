package com.everson.clientes.repository;

import com.everson.clientes.entity.Clientes;
import com.everson.clientes.entity.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String> {

    @Query("SELECT cli from Clientes cli inner join Compras com on com.cliente = cli.id")
    List<Clientes> findTop3Clientes();
}