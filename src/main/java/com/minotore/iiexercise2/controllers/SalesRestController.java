package com.minotore.iiexercise2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minotore.iiexercise2.document.Sale;
import com.minotore.iiexercise2.services.implementation.SaleService;

@RestController
public class SalesRestController {

	@Autowired
	private SaleService salesService;

	@GetMapping(path = "/bylibname/{libname}")
	public List<Sale> getByLibraryName(@PathVariable("libname") String libraryName) {
		return salesService.getByLibraryName(libraryName);
	}

	@PostMapping(path = "/add")
	public Sale add(@RequestBody Sale sale) {
		return salesService.add(sale);

	}
}
