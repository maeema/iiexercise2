package com.minotore.iiexercise2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minotore.iiexercise2.dao.SaleRepository;
import com.minotore.iiexercise2.document.Sale;
import com.minotore.iiexercise2.dto.StockDTO;
import com.minotore.iiexercise2.services.ISaleService;

@Service
public class SaleService implements ISaleService{
	
	@Autowired
	private SaleRepository saleRepository;
	@Autowired
	private ClientService clientService;
	
	public List<Sale> getByLibraryName(String libraryName) {
		
		return saleRepository.findAllByLibraryName(libraryName);
	}

	public Sale add(Sale sale) {
		StockDTO stock = clientService.getStockBySaleIFIsValide(sale);
		if(stock !=null) {
			clientService.SaveValideSale(sale, stock);
			return saleRepository.save(sale);
		}
		
		return null;
	}

}
