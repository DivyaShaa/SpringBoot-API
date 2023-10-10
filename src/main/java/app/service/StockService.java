package app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.StockRepository;
import app.model.Stock;

@Transactional
@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;

	public List<Stock> getAll() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}
	
	
	
	
	

}
