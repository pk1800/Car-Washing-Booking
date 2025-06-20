http://localhost:8082/swagger-ui/index.html

this Url fro running the Swagger API 


**ABOUT**

**🚗 Car Washing Booking Platform**
A complete web application for booking car washing services online. This system allows customers to register, browse services, book appointments,
and track their bookings, while admins can manage users, services, and bookings from a dedicated dashboard.

📌 **Features**
👤 **User Module**
Register/Login with role-based access (User / Admin)

View available car wash services

Book services by selecting time slot and date

View and manage personal bookings

🛠️ **Admin Module**
Admin dashboard to manage all bookings

Add/Edit/Delete services

Manage users and view reports

🧰 **Tech Stack**
Layer	Technology
Backend	Java + Spring Boot
Frontend	HTML, CSS, JavaScript (or React)
Database	MySQL
ORM	Spring Data JPA
API Docs	Swagger (OpenAPI)
Security	Spring Security with Session Auth

🗃️ **Database Schema (Simplified)**
**User**
id

name

email

password

role (USER / ADMIN)

**Service**
id

name

description

price

**Booking**
id

user_id

service_id

date

time_slot

status
