package com.chouguleindustries.lambda.dao;

import java.util.Collection;

import com.chouguleindustries.lambda.dto.HabbaDTO;
import com.chouguleindustries.lambda.search.HabbaSearch;

public interface HabbaDAO {

	HabbaDTO ondunsHuduku(HabbaSearch dto);

	Collection<HabbaDTO> yalavanuHuduku(HabbaSearch search);

	boolean save(HabbaDTO dto);

}
