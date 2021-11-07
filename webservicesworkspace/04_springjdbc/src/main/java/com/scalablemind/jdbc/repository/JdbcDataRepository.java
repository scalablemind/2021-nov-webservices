package com.scalablemind.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scalablemind.jdbc.model.TestData;
import com.scalablemind.jdbc.rowmappers.TestDataListRowmapper;

@Repository
public class JdbcDataRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(String remarks) {
		jdbcTemplate.update("insert into test_data(remarks) values(?)", remarks);
	}
	
	public List<TestData> getTestDataList() {
		return jdbcTemplate.query("select test_id as test_id,remarks from test_data",new TestDataListRowmapper());
	}
	
	public void deleteAllRecords() {
		jdbcTemplate.execute("delete from test_data");
	}
	
}
