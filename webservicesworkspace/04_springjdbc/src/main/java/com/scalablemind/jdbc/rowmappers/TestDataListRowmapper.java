package com.scalablemind.jdbc.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scalablemind.jdbc.model.TestData;

public class TestDataListRowmapper implements RowMapper<TestData>{
	
	@Override
	public TestData mapRow(ResultSet rs, int rowNum) throws SQLException {
		TestData data = new TestData();
		data.setRemarks(rs.getString("remarks"));
		data.setTestId(rs.getInt("test_id"));
		return data;
	}

}
