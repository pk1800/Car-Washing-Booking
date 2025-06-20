package com.carbooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbooking.entities.ServiceData;
import com.carbooking.repositories.ServiceRepository;

@Service

public class ServiceServiceImpl implements ServiceService {

	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public ServiceData saveData(ServiceData serviceData) {
		return serviceRepository.save(serviceData);
	}

	@Override
	public List<ServiceData> findAll() {
		return serviceRepository.findAll();
	}

	@Override
	public ServiceData findById(Long id) {
		return serviceRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		serviceRepository.deleteById(id);
	}

}
