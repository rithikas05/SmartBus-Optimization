# Smart Bus Occupancy Optimization Platform

# Coding Standards

## Purpose

This document defines coding standards for all modules.

All developers must follow these standards.

---

# Java Naming Standards

## Class Names

Use Pascal Case.

Examples:

User

Booking

Trip

AuthController

BookingService

UserRepository

---

## Variable Names

Use Camel Case.

Examples:

userId

bookingId

tripDate

routeName

totalRevenue

---

## Method Names

Use Camel Case.

Examples:

createBooking()

cancelBooking()

getUserProfile()

searchTrips()

---

# Package Structure

Use:

com.smartbus

controller

service

repository

entity

dto

config

exception

security

---

# Entity Standards

One Entity Per Table.

Examples:

User.java

Booking.java

Trip.java

Bus.java

---

# Repository Standards

Repository Names:

UserRepository

BookingRepository

TripRepository

RouteRepository

---

# Service Standards

Service Names:

UserService

BookingService

AnalyticsService

RevenueService

---

# Controller Standards

Controller Names:

AuthController

BookingController

TripController

AnalyticsController

---

# DTO Standards

Use DTOs for API communication.

Examples:

LoginRequestDTO

BookingRequestDTO

TripResponseDTO

UserResponseDTO

---

# API Standards

Use REST APIs.

Examples:

GET /api/bookings

POST /api/bookings

PUT /api/bookings/{id}

DELETE /api/bookings/{id}

---

Use plural naming.

Correct:

/api/bookings

/api/routes

/api/trips

Incorrect:

/api/booking

/api/route

/api/trip

---

# Database Standards

Do not change:

Table Names

Column Names

Primary Keys

Relationships

Without approval.

---

# Exception Handling

Use Global Exception Handling.

Return meaningful messages.

Bad:

NullPointerException

Good:

Booking not found.

---

# Logging Standards

Log:

Create

Update

Delete

Errors

Examples:

Booking Created

Booking Cancelled

Trip Updated

---

# Frontend Naming Standards

Components:

LoginComponent

BookingComponent

TripListComponent

---

Services:

auth.service.ts

booking.service.ts

analytics.service.ts

---

# Git Standards

Branch Names:

auth-module

bus-route-trip-module

booking-module

waitlist-baggage-module

analytics-module

---

Commit Messages

Good Examples:

Authentication Module Completed

Booking API Added

Analytics Dashboard Added

---

Bad Examples:

Final

Done

Updated

Fix

---

# Code Quality Rules

Avoid Duplicate Code.

Use Meaningful Names.

Keep Methods Small.

Follow Layered Architecture.

Use DTO Pattern.

---

# Architecture Rule

Controller

↓

Service

↓

Repository

↓

Database

Never access Repository directly from Controller.

---

# Final Objective

All modules should follow the same coding style, naming conventions, architecture and project structure to ensure smooth integration.
