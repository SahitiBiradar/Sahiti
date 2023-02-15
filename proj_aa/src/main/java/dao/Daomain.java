package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dtoclass;

public class Daomain {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
 public void insert(Dtoclass d1){
	 
	 entityTransaction.begin();
	 entityManager.persist(d1);
	 entityTransaction.commit();
 }
}
