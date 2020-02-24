package com.minotore.iiexercise2.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.minotore.iiexercise2.document.Sale;

public interface SaleRepository extends MongoRepository<Sale, ObjectId>{
	List<Sale> findAllByLibraryName(String LibraryName);
}
