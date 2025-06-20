package com.carbooking.services;

import java.util.List;

import com.carbooking.entities.ServiceData;

public interface ServiceService {
	
	public ServiceData saveData(ServiceData service);

	public List<ServiceData> findAll();

	public ServiceData findById(Long id);

	public void deleteById(Long id);
}
