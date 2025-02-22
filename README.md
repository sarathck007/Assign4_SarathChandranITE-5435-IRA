# Workshop Registration System - Spring Boot Application

## Description
A web-based workshop registration system built using Spring Boot that allows users to register for workshops and process payments. The application features a user-friendly form with validation and success confirmation.

## Features
- Registration form with field validation
- Payment processing options (Cash/Cheque/DD)
- MySQL database integration
- Responsive design
- Form reset functionality
- Success page display

## Technology Stack
- Spring Boot 3.x
- MySQL Database
- Thymeleaf Templates
- Spring Data JPA
- HTML/CSS
- Jakarta Bean Validation

## Installation
1. Clone the repository
2. Configure MySQL database in application.properties
3. Run as Spring Boot Application
4. Access at http://localhost:8080

## Form Fields
### Personal Information
- First Name (Required)
- Last Name (Required)  
- Company/Institution (Required)
- Address (Required)
- City (Required)
- State/Province
- Country
- Email (Required with validation)
- Phone (Required with format validation)

### Additional Details
- Meal Preference
- Payment Mode
- DD/Cheque Details (if applicable)

## Field Validations
- Email Format: Standard email validation
- Phone Format: (XXX)XXX-XXXX or XXX-XXX-XXXX
- Required Fields: Marked with *
