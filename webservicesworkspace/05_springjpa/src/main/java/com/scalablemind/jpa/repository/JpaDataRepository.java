package com.scalablemind.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.scalablemind.jpa.entity.TestJpaData;

@Repository
public class JpaDataRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insert(String remarks) {
		TestJpaData data = new TestJpaData();
		data.setRemarks(remarks);
		entityManager.merge(data);
	}
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<TestJpaData> getTestDataList() {
		return entityManager.createQuery("select e from TestJpaData e").getResultList();
	}
	
	@Transactional
	public void deleteAllRecords() {
		entityManager.createQuery("delete from TestJpaData").executeUpdate();
	}


}
