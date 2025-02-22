package com.week6.assignment4.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.week6.assignment4.model.WorkshopRegistration;

/**
 * Repository interface for Workshop Registration
 * Extends CrudRepository to provide basic CRUD operations
 */
@Repository
public interface WorkshopRegistrationRepo extends CrudRepository<WorkshopRegistration, Long> {
}