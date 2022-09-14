package com.xworkz.metro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.metro.entity.MetroEntity;
import static com.xworkz.metro.util.EMFUtil.*;

public class MetroDAOImpl implements MetroDAO {
    EntityManagerFactory factory=getFactory();

	public Boolean save(MetroEntity entity) {
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		}
		catch (PersistenceException e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			manager.close();
			
		}
		
		return true;
	}

}
