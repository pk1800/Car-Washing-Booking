package com.carbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carbooking.entities.ServiceData;

public interface ServiceRepository extends JpaRepository<ServiceData, Long> {

}
