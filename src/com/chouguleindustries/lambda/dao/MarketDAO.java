package com.chouguleindustries.lambda.dao;

import java.util.Collection;

import com.chouguleindustries.lambda.dto.MarketDTO;
import com.chouguleindustries.lambda.search.MarketSearch;

public interface MarketDAO {
	MarketDTO find(MarketSearch search);

	Collection<MarketDTO> findAll(MarketSearch search);

}
