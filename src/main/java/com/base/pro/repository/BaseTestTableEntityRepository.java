package com.base.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.pro.entity.BaseTestTableEntity;


public interface BaseTestTableEntityRepository extends JpaRepository<BaseTestTableEntity, Integer> {
																					
	BaseTestTableEntity findOneById(int id);
	
}
