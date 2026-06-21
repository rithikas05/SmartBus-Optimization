# Smart Bus Occupancy Optimization Platform

# UX Standards

## Purpose

This document defines common user experience standards for all modules.

All team members must follow these standards.

---

# Toast Notifications

Use Angular Material Snackbar.

Success Messages:

Login Successful

Registration Successful

Booking Confirmed Successfully

Booking Cancelled Successfully

Bus Created Successfully

Route Created Successfully

Trip Created Successfully

Baggage Registered Successfully

Profile Updated Successfully

---

Error Messages

Invalid Credentials

Email Already Exists

Seat Not Available

Booking Failed

Data Not Found

Something Went Wrong. Please Try Again.

---

Warning Messages

Waitlist Full

No Seats Available

Session Expired

Unsaved Changes Detected

---

# Confirmation Dialogs

Mandatory Before:

Delete Record

Cancel Booking

Logout

Remove Route

Remove Bus

---

Standard Message

Are you sure you want to proceed?

Buttons:

Yes

No

---

# Form Validation Standards

Required Field

Message:

This field is required.

---

Email Validation

Message:

Please enter a valid email address.

---

Mobile Validation

Message:

Please enter a valid 10-digit mobile number.

---

Password Validation

Message:

Password must contain at least 6 characters.

---

Number Validation

Message:

Please enter a valid number.

---

# Search Standards

If records exist:

Display table.

If records not found:

Display:

No records found.

Never show blank pages.

---

# Loading Indicators

Show loading spinner while API is processing.

Examples:

Login

Booking

Analytics Dashboard

Search Trip

Baggage Verification

---

# Empty State Messages

Bookings

No bookings available.

---

Waitlist

No waitlist records available.

---

Baggage

No baggage records found.

---

Analytics

No analytics data available.

---

# Date Format

DD-MM-YYYY

Example:

21-06-2026

---

# Time Format

HH:mm

Example:

22:30

---

# Currency Format

₹

Example:

₹1200

---

# Dashboard Standards

Every dashboard should contain:

Cards

Charts

Tables

---

# Table Standards

Mandatory:

Search

Pagination

Sorting

---

# Success Flow Standards

After successful create/update:

Show Success Toast

Refresh Data

Stay On Same Screen

---

# Error Handling Standards

Never show technical errors to users.

Bad Example:

500 Internal Server Error

NullPointerException

Database Connection Failed

---

Good Example:

Something went wrong. Please try again.

---

# Final Objective

Every screen should provide a consistent and professional user experience across the entire application.
