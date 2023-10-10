package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Stock;
import app.service.StockService;

@CrossOrigin(origins="*")
@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	@GetMapping("/stocks")
	public List<Stock> list() {
	    return stockService.getAll();
	}

}
