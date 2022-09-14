package com.xworkz.metro.runner;

import com.xworkz.metro.dao.MetroDAO;
import com.xworkz.metro.dao.MetroDAOImpl;
import com.xworkz.metro.entity.MetroEntity;

public class MetroRunner {

	public static void main(String[] args) {
		MetroEntity entity=new MetroEntity(1, "NammaMetro", "Bengalur", 200.00D, "Majestic", "BTM");
		MetroEntity entity1=new MetroEntity(2, "Mumbai", "Mumbai", 300.00D, "Narrow", "Street");
		MetroEntity entity2=new MetroEntity(3, "HubliMetro", "Hubli", 150.00D, "OldBusStand", "BVB");
		MetroEntity entity3=new MetroEntity(4, "HubliMetro", "Hubli", 150.00D, "OldBusStand", "BVB");
		MetroEntity entity4=new MetroEntity(5, "DharwadMetro", "Dharwad", 1000.00D, "Navanagar", "JayaNagar");
		MetroDAO dao=new MetroDAOImpl();
		Boolean save = dao.save(entity);
		Boolean save2 = dao.save(entity1);
		Boolean save3 = dao.save(entity2);
		Boolean save4 = dao.save(entity3);
		Boolean save5 = dao.save(entity4);
		
		System.out.println(save);
		System.out.println(save2);
		System.out.println(save3);
		System.out.println(save4);
		System.out.println(save5);
	
		

	}

}
