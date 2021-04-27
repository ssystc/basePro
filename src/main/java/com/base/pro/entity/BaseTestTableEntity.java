package com.base.pro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//测试表
@Entity
public class BaseTestTableEntity {

	//主键ID
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//主键自增生成策略
	private Integer id;
		
	@Column
	private String field1;
		
	@Column
	private String field2;
	
	public BaseTestTableEntity() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}	
	
}
