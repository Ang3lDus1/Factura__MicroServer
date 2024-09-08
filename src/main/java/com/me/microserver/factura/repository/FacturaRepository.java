package com.me.microserver.factura.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.microserver.factura.entity.Factura;

public interface FacturaRepository extends MongoRepository<Factura, String> {

}
