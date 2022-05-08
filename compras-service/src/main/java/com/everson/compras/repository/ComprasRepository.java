package com.everson.compras.repository;

import com.everson.compras.entity.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, String> {

    @Query("SELECT c FROM Compras c WHERE c.valorTotal = (select max(com.valorTotal) from Compras com WHERE year(com.data) = :ano)")
    Compras maiorCompra(@Param("ano") Integer ano);
}
