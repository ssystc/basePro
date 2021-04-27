package com.base.pro.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.pro.entity.BaseTestTableEntity;
import com.base.pro.repository.BaseTestTableEntityRepository;
import com.base.pro.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {

	public static Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);
	
	@Autowired
	private BaseTestTableEntityRepository res;

	@Override
	public BaseTestTableEntity findSome(int id) {
		return res.findOneById(id);
	}
	
}
