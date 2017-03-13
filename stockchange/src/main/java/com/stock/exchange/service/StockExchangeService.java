package com.stock.exchange.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stock.exchange.modal.Stock;

/**
 * @author san
 * This service helps in handling the values of the current stock. This will be staic content
 */
@Service("stockExchangeService")
public class StockExchangeService {
	public static final List<Stock> STOCKLIST_ONE = new ArrayList<Stock>();
	public static final List<Stock> STOCKLIST_TWO = new ArrayList<Stock>();
	
	public static int counter=0;

	static {
		STOCKLIST_ONE.add(new Stock("AIRTEL", 2200.00f, true, 1.50f));
		STOCKLIST_ONE.add(new Stock("RELIANCE", 1500.00f, false, 0.10f));
		STOCKLIST_ONE.add(new Stock("JIO", 100.00f, true, 10.00f));
		STOCKLIST_ONE.add(new Stock("AIRCEL", 900.00f, false, 10.00f));
		STOCKLIST_ONE.add(new Stock("VODAFONE", 1200.00f, true, 0.10f));
		STOCKLIST_ONE.add(new Stock("TATA INDICOM", 400.00f, false, 2.0f));

	}
	static {
		STOCKLIST_TWO.add(new Stock("AIRTEL", 2000.00f, false, 1.40f));
		STOCKLIST_TWO.add(new Stock("RELIANCE", 3000.00f, true, 50.00f));
		STOCKLIST_TWO.add(new Stock("JIO", 50.00f, false, 50.00f));
		STOCKLIST_TWO.add(new Stock("AIRCEL", 1500.00f, false, 25.00f));
		STOCKLIST_TWO.add(new Stock("VODAFONE", 1400.00f, false, 25.10f));
		STOCKLIST_TWO.add(new Stock("TATA INDICOM", 600.00f, true, 23.0f));

	}

	/**
	 * This method returns all stock information from mockDB
	 * @return List<Stock>
	 */
	public List<Stock> getAllStocks() {
		return getMocKValueFromDB();
	}
	
	

	/**
	 * This is actual BO method to fetch DB value. Which has been mocked based on timer
	 * @return Map<Integer, Stocks>
	 */
	public  List<Stock> getMocKValueFromDB()
	{
		System.out.println("Entering StockExchangeSerrcice getMocKValueFromDB method Date ");
		List<Stock> displayStock = new ArrayList<Stock>();
		
		if(counter%2==0)
			{
					displayStock=STOCKLIST_ONE;
					counter++;
			}
			else
			{
				displayStock=STOCKLIST_TWO;
			counter++;
			}
		System.out.println("Exiting StockExchangeSerrcice getMocKValueFromDB method");
		return displayStock;
	}
}
