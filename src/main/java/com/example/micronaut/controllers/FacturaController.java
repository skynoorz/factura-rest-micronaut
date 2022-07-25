package com.example.micronaut.controllers;

import com.example.micronaut.models.dao.FacturaRepository;
import com.example.micronaut.models.entity.Factura;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/api")
public class FacturaController {

    @Inject
    private FacturaRepository repository;

    @Get("/facturas")
    public List<Factura> index() {
//        List<Factura> facturas = new ArrayList<>();
//        return facturas;
        return (List<Factura>) repository.findAll();
    }

    @Get("/factura")
    public List<Factura> getFactura() {
//        List<Factura> facturas = new ArrayList<>();
//        return facturas;
        return repository.findByContrato(1);
    }
}
