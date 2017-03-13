package com.stock.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.stock.exchange.service.StockExchangeService;

/**
 * @author san
 *This class helps in  handling rest requests 
 */
@RestController
public class StockExchangeController {

	@Autowired
	private StockExchangeService stockExchangeService;

	/**
	 * This method handles the get Stock function for fetching the stock values
	 * @return JSON
	 */
	@RequestMapping(value = "/getstock", method = RequestMethod.GET, produces = { "application/json" })
	public String getAllStocks() {
		Gson gson = new Gson();
		return gson.toJson(stockExchangeService.getAllStocks());
	}
}
