package com.carbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbooking.entities.ServiceData;
import com.carbooking.services.ServiceService;

@RestController
@RequestMapping("/api/car-washing")
@CrossOrigin("*")
public class ServiceController {

	@Autowired
	private ServiceService serviceService;

	@PostMapping
	public ServiceData createService(@RequestBody ServiceData serviceData) {
		return serviceService.saveData(serviceData);
	}

	@GetMapping
	public List<ServiceData> findAll() {
		return serviceService.findAll();
	}

	@PostMapping("/{id}")
	public ServiceData getById(@PathVariable Long id) {
		return serviceService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteService(@PathVariable Long id) {
		serviceService.deleteById(id);
	}

}
