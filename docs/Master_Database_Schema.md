# Smart Bus Occupancy Optimization Platform

# Master Database Schema

## Database Name

smart_bus_db

---

# Table 1 - User

Purpose:

Store Passenger, Operator and Admin details.

Columns:

user_id (PK)

full_name

email

mobile_number

password

role

status

created_date

---

# Table 2 - Bus

Purpose:

Store Bus Information.

Columns:

bus_id (PK)

bus_number

bus_name

bus_type

capacity

status

---

# Table 3 - Route

Purpose:

Store Route Information.

Columns:

route_id (PK)

route_name

source

destination

status

---

# Table 4 - Stop

Purpose:

Store Route Stops.

Columns:

stop_id (PK)

route_id (FK)

stop_name

stop_order

---

Relationship

Route (1) → (N) Stops

---

# Table 5 - Trip

Purpose:

Store Scheduled Trips.

Columns:

trip_id (PK)

route_id (FK)

bus_id (FK)

travel_date

departure_time

arrival_time

status

---

Relationship

Bus (1) → (N) Trips

Route (1) → (N) Trips

---

# Table 6 - Seat

Purpose:

Store Seat Information.

Columns:

seat_id (PK)

trip_id (FK)

seat_number

status

---

Status Values

AVAILABLE

BOOKED

CANCELLED

---

# Table 7 - Booking

Purpose:

Store Passenger Bookings.

Columns:

booking_id (PK)

user_id (FK)

trip_id (FK)

seat_id (FK)

fare_amount

booking_date

status

---

Status Values

CONFIRMED

CANCELLED

---

Relationship

User (1) → (N) Booking

Trip (1) → (N) Booking

Seat (1) → (1) Booking

---

# Table 8 - Waitlist

Purpose:

Store Waitlist Requests.

Columns:

waitlist_id (PK)

user_id (FK)

trip_id (FK)

seat_preference

request_date

status

---

Status Values

WAITING

NOTIFIED

BOOKED

EXPIRED

---

# Table 9 - Seat_Reallocation

Purpose:

Track Occupancy Recovery.

Columns:

reallocation_id (PK)

seat_id (FK)

trip_id (FK)

cancelled_booking_id

reallocated_booking_id

recovery_date

---

# Table 10 - Alert

Purpose:

Store System Alerts.

Columns:

alert_id (PK)

alert_type

message

severity

status

created_date

---

# Table 11 - Recommendation

Purpose:

Store Optimization Recommendations.

Columns:

recommendation_id (PK)

route_id (FK)

recommendation_type

description

priority

generated_date

---

# Table 12 - Baggage

Purpose:

Store Baggage Tracking Information.

Columns:

baggage_id (PK)

booking_id (FK)

user_id (FK)

trip_id (FK)

weight

description

qr_code

status

---

Status Values

REGISTERED

IN_TRANSIT

ARRIVED

DELIVERED

---

# Entity Relationship Summary

User

├── Booking

├── Waitlist

└── Baggage

---

Bus

└── Trip

---

Route

├── Stop

├── Trip

└── Recommendation

---

Trip

├── Seat

├── Booking

├── Waitlist

└── Baggage

---

Booking

└── Seat_Reallocation

---

# Database Rules

1. Do not rename tables.

2. Do not rename columns.

3. Do not create duplicate tables.

4. Follow Master API Contract.

5. Any schema changes must be approved by Technical Lead.

---

# Total Tables

12

User

Bus

Route

Stop

Trip

Seat

Booking

Waitlist

Seat_Reallocation

Alert

Recommendation

Baggage
