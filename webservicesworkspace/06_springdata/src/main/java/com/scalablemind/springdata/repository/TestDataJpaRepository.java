package com.scalablemind.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scalablemind.springdata.entity.TestJpaData;

@Repository
@Transactional
public interface TestDataJpaRepository extends JpaRepository<TestJpaData,Integer>{
	

	@Transactional(readOnly = false)
	TestJpaData findByRemarks(String remarks);

}
