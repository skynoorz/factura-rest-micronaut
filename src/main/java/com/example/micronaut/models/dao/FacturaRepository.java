package com.example.micronaut.models.dao;

import com.example.micronaut.models.entity.Factura;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long>{

    public List<Factura> findByContrato(Integer contrato);
}
