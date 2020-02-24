package com.minotore.iiexercise2.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minotore.iiexercise2.document.Sale;
import com.minotore.iiexercise2.dto.StockDTO;
import com.minotore.iiexercise2.services.IFeignClient;

@Service
public class ClientService {
	@Autowired
	private IFeignClient client;

	public StockDTO getStockBySaleIFIsValide(Sale sale) {
		StockDTO targetStock = null;
		for (StockDTO stock : client.getByLibrary(sale.getLibraryName())) {
			if (stock.getBook().getName().equals(sale.getBookName())) {
				if (Math.abs(stock.getBook().getPrice() - sale.getBookPrice()) < 0.01
						&& stock.getQuantity() >= sale.getUnitsSold())
					targetStock = stock;
				break;
			}

		}
		return targetStock;

	}

	public void SaveValideSale(Sale sale, StockDTO valideStock) {
		valideStock.setQuantity(valideStock.getQuantity() - sale.getUnitsSold());
		valideStock.getBook().setTotalUnitSold(valideStock.getBook().getTotalUnitSold() + sale.getUnitsSold());
		client.updateBook(valideStock.getBook());
		client.updateStock(valideStock);

	}

}
