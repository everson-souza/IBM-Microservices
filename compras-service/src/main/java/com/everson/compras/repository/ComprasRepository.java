package com.everson.compras.repository;

import com.everson.compras.entity.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, String> {

    @Query("SELECT c FROM Compras c WHERE year(c.data) = :ano and c.valorTotal = (select max(valorTotal) from Compras) ORDER BY c.valorTotal")
    Compras maiorCompra(@Param("ano") Integer ano);
}
