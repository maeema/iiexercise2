package com.minotore.mongoAndSpring.services;

import java.util.List;

import com.minotore.mongoAndSpring.document.Sale;

public interface ISaleService {
	
	public List<Sale> getByLibraryName(String libraryName) ;

	public Sale add(Sale sale) ;

}
