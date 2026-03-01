Online Food Delivery Project (Clone of Swiggy / Zomato)

A full-stack online food delivery application featuring a customer-facing frontend, an admin panel for management, and a robust Java Spring Boot backend.


🚀 Features

User Authentication: Secure JWT-based authentication and authorization.
Customer Frontend (foodies): Browse restaurants, view menus, add to cart, and place orders.
Admin Panel (adminpanel): Manage restaurants, food items, view orders, and manage users.
Payment Gateway Integration: Integrated with Razorpay for secure online payments.
Cloud Storage: Integration with AWS S3 for storing food and restaurant images.
Responsive Design: Built with React and Bootstrap for a mobile-friendly experience.

-----------------
🛠️ Tech Stack

Frontend & Admin Panel: React, React Router DOM, Bootstrap 5, Axios, Razorpay.
Backend: Java Spring Boot 3.4.3 with Spring Security and JWT authentication.
Database & Storage: MongoDB (Spring Data MongoDB) and AWS S3.
Utilities & Tools: Lombok, Spring Boot DevTools, Razorpay Java SDK.

-----------------

📁 Project Structure
online-food-delivery-project/
├── foodies/         
├── adminpanel/      
└── foodiesapi/      

-----------------

🔑 Environment Variables Configuration
You will need to set up environment variables for the backend (foodiesapi) usually in an application.properties or application.yml file:

spring.data.mongodb.uri=your_mongodb_connection_string
jwt.secret=your_strong_jwt_secret_key
jwt.expiration=86400000
aws.s3.accessKey=your_aws_access_key
aws.s3.secretKey=your_aws_secret_key
aws.s3.region=your_aws_region
aws.s3.bucketName=your_s3_bucket_name
razorpay.keyId=your_razorpay_key_id
razorpay.keySecret=your_razorpay_key_secret

