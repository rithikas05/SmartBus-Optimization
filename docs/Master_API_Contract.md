# Smart Bus Occupancy Optimization Platform

# Master API Contract

## Base URL

/api

---

# MODULE 1 - AUTHENTICATION

## Register User

POST /api/auth/register

Purpose:

Register a new user.

Request:

{
fullName,
email,
mobileNumber,
password,
role
}

Response:

{
userId,
message
}

---

## Login User

POST /api/auth/login

Purpose:

Login user.

Request:

{
email,
password
}

Response:

{
userId,
fullName,
role
}

---

## Get Profile

GET /api/users/profile/{userId}

---

## Update Profile

PUT /api/users/profile/{userId}

---

# MODULE 2 - BUS MANAGEMENT

## Create Bus

POST /api/buses

---

## Get All Buses

GET /api/buses

---

## Get Bus Details

GET /api/buses/{busId}

---

## Update Bus

PUT /api/buses/{busId}

---

## Delete Bus

DELETE /api/buses/{busId}

---

# MODULE 3 - ROUTE MANAGEMENT

## Create Route

POST /api/routes

---

## Get All Routes

GET /api/routes

---

## Get Route Details

GET /api/routes/{routeId}

---

## Update Route

PUT /api/routes/{routeId}

---

## Delete Route

DELETE /api/routes/{routeId}

---

## Add Stop

POST /api/stops

---

## Get Stops By Route

GET /api/stops/route/{routeId}

---

# MODULE 4 - TRIP MANAGEMENT

## Create Trip

POST /api/trips

---

## Get All Trips

GET /api/trips

---

## Get Trip Details

GET /api/trips/{tripId}

---

## Update Trip

PUT /api/trips/{tripId}

---

## Delete Trip

DELETE /api/trips/{tripId}

---

## Search Trips

GET /api/trips/search

Parameters:

source

destination

travelDate

---

# MODULE 5 - BOOKING

## Get Available Seats

GET /api/seats/{tripId}

---

## Create Booking

POST /api/bookings

Request:

{
userId,
tripId,
seatId
}

Response:

{
bookingId,
status
}

---

## Booking Details

GET /api/bookings/{bookingId}

---

## User Bookings

GET /api/bookings/user/{userId}

---

## Cancel Booking

DELETE /api/bookings/{bookingId}

---

# MODULE 6 - WAITLIST

## Join Waitlist

POST /api/waitlist

Request:

{
userId,
tripId,
seatPreference
}

---

## View Waitlist

GET /api/waitlist/user/{userId}

---

## Seat Reallocation Metrics

GET /api/reallocation/metrics

---

# MODULE 7 - BAGGAGE TRACKING

## Register Baggage

POST /api/baggage/register

---

## Get Baggage Details

GET /api/baggage/{baggageId}

---

## User Baggage

GET /api/baggage/user/{userId}

---

## Verify QR

POST /api/baggage/verify

---

## Confirm Delivery

PUT /api/baggage/deliver

---

# MODULE 8 - OCCUPANCY ANALYTICS

## Occupancy Dashboard

GET /api/analytics/occupancy

---

## Route Occupancy

GET /api/analytics/routes

---

## Bus Utilization

GET /api/analytics/buses

---

## Segment Occupancy

GET /api/analytics/segments

---

# MODULE 9 - REVENUE ANALYTICS

## Revenue Dashboard

GET /api/revenue/dashboard

---

## Revenue Recovery

GET /api/revenue/recovery

---

## Revenue Leakage

GET /api/revenue/leakage

---

## Route Revenue Analysis

GET /api/revenue/routes

---

# MODULE 10 - ROUTE PERFORMANCE

## Route Performance Dashboard

GET /api/routes/performance

---

## Route Rankings

GET /api/routes/rankings

---

## Demand Analysis

GET /api/routes/demand

---

# MODULE 11 - ALERTS & RECOMMENDATIONS

## Get Alerts

GET /api/alerts

---

## Alert Details

GET /api/alerts/{alertId}

---

## Get Recommendations

GET /api/recommendations

---

## Recommendation Details

GET /api/recommendations/{recommendationId}

---

# API RULES

1. Do not rename endpoints.

2. Do not change request structures.

3. Do not change response structures.

4. Follow this contract throughout development.

5. Any API changes must be approved by Technical Lead.

---

# Total Modules

11

# Total APIs

Approximately 40 APIs
