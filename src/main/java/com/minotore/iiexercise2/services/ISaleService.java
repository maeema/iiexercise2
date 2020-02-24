package com.minotore.iiexercise2.services;

import java.util.List;

import com.minotore.iiexercise2.document.Sale;

public interface ISaleService {
	
	public List<Sale> getByLibraryName(String libraryName) ;

	public Sale add(Sale sale) ;

}
