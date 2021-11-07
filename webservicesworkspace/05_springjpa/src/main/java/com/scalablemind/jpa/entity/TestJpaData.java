package com.scalablemind.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_data")
public class TestJpaData {
	
	@Id
	@Column(name="test_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testId;
	
	@Column(name="remarks")
	private String remarks;

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "TestData [testId=" + testId + ", remarks=" + remarks + "]";
	}
	
	

}
