package com.chouguleindustries.lambda.tester;

import java.util.Collection;

import com.chouguleindustries.lambda.dao.MarketDAO;
import com.chouguleindustries.lambda.dao.MarketDAOimpl;
import com.chouguleindustries.lambda.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDAO dao = new MarketDAOimpl();

		MarketDTO name = dao.find((a) -> a.getName().equals("D-Mart"));
		System.out.println(name);

		name = dao.find((c) -> c.getLocation().equals("VijayNagar"));
		System.out.println(name);

		System.out.println("**************");
		Collection<MarketDTO> coll = dao.findAll((b) -> b.getNoOfShops() > 2);
		for (MarketDTO market : coll) {
			System.out.println(market);

		}

	}
}
