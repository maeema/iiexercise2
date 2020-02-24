package com.minotore.iiexercise2.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.minotore.iiexercise2.dto.BookDTO;
import com.minotore.iiexercise2.dto.StockDTO;

@PropertySource("classpath:application.properties")
@FeignClient(name = "microservice-iiexercise", url = "${fiegn.server.url}")
public interface IFeignClient {

	@GetMapping(path = "/library/stocks/{libname}")
	public List<StockDTO> getByLibrary(@PathVariable("libname") String libraryName);

	@PutMapping(path = "/library/modifyBookQuantity")
	public void updateStock(@RequestBody StockDTO stock);
	
	@PutMapping(path = "/book/update")
	public void updateBook(@RequestBody BookDTO book);
	
}
