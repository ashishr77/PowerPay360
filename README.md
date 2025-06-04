# 💡 PowerPay360 – Electricity Billing and Payment System

PowerPay360 is a Java-based backend system built using **Spring Boot**, designed to handle **electricity billing**, **bill generation**, and **payment processing**. It exposes a RESTful API that can be integrated with frontend applications or mobile apps to manage utility bills.

---

## 🚀 Features

- 🔎 **Fetch Bill Details** by Service Request Number  
- 💳 **Make Payments** securely by bill ID and amount  
- 🧾 **Generate New Bills** dynamically using structured request  
- 🌐 REST API endpoints for seamless integration  
- 🧪 Easily testable using Postman

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Maven**
- **REST API**
- **MySQL**
- **Spring Data JPA**

---

## 📁 Project Structure (Key Parts)

```bash
PowerPay360/
├── Controller/
│   └── BillDetailsController.java
├── Repository/
│   └── BillDetailsRepository.java
├── Entity/
│   ├── BillDetails.java
│   └── GenerateBillRequest.java
├── Services/
│   └── BillDetailsService.java
└── application.properties
