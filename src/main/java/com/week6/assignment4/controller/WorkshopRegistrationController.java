package com.week6.assignment4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.week6.assignment4.model.WorkshopRegistration;
import com.week6.assignment4.repo.WorkshopRegistrationRepo;

import jakarta.validation.Valid;

/**
 * Controller class for handling workshop registration operations Manages form
 * display, submission, and reset functionality
 */
@Controller
public class WorkshopRegistrationController {

	@Autowired
	WorkshopRegistrationRepo registrationRepo;

	/*
	 * Handles GET requests for the registration form Maps
	 */
	@GetMapping({ "/", "/register" })
	public String showRegistrationForm(WorkshopRegistration registration, Model model) {
		model.addAttribute("success", false);
		return "registration-form";
	}

	/**
	 * Processes form submission Validates input and saves registration data
	 */
	@PostMapping("/submit")
	public String submitRegistration(@Valid WorkshopRegistration registration, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("success", false);
			return "registration-form";
		}

		registrationRepo.save(registration);
		model.addAttribute("workshopRegistration", registration);
		model.addAttribute("success", true);
		return "registration-form";
	}

	/**
	 * Handles form reset request Creates new registration object and resets form
	 */
	@PostMapping("/reset")
	public String resetForm(Model model) {
		model.addAttribute("workshopRegistration", new WorkshopRegistration());
		model.addAttribute("success", false);
		return "registration-form";
	}
}
