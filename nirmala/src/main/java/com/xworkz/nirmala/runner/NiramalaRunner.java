package com.xworkz.nirmala.runner;

import java.time.LocalDate;

import com.xworkz.nirmala.entity.NirmalaEntity;
import com.xworkz.nirmala.service.NirmalaService;
import com.xworkz.nirmala.service.NirmalaServiceImpl;

public class NiramalaRunner {

	public static void main(String[] args) {
		NirmalaEntity entity = new NirmalaEntity("BTM", "Male", "Public", 10.00D, "Muttu", LocalDate.now(), "Ravi",
				LocalDate.now());
		NirmalaEntity entity1 = new NirmalaEntity("RR Nagar", "Male", "Private", 10.00D, "Charana", LocalDate.now(), "Suhas",
				LocalDate.now());
		NirmalaEntity entity2 = new NirmalaEntity("JR Nagar", "Female", "Private", 10.00D, "Prajawal", LocalDate.now(), "DP",
				LocalDate.now());
		NirmalaEntity entity3 = new NirmalaEntity("VR Nagar", "Female", "Private", 20.00D, "Hanamant", LocalDate.now(), "Basavaraj",
				LocalDate.now());
		NirmalaEntity entity4 = new NirmalaEntity("RJ Nagar", "Male", "Public", 5.00D, "Sachin", LocalDate.now(), "Swami",
				LocalDate.now());
		NirmalaService nirmalaService=new NirmalaServiceImpl();
		nirmalaService.validateAndSave(entity);
		nirmalaService.validateAndSave(entity1);
		nirmalaService.validateAndSave(entity2);
		nirmalaService.validateAndSave(entity3);
		nirmalaService.validateAndSave(entity4);
	}

}
