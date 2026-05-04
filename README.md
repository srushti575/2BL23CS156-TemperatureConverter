# 2BL23CS156-TemperatureConverter
This project implements a Temperature Converter using Java Servlets.  It converts Celsius to Fahrenheit and Kelvin and displays results.

# Temperature Converter (Servlet)

## 📌 Description
This project implements a Temperature Converter using Java Servlets. 
It converts Celsius to Fahrenheit and Kelvin and displays results.

## 🎯 Objective
- Accept temperature in Celsius
- Convert to Fahrenheit and Kelvin
- Display results with formulas

## 🛠 Technologies Used
- Java (JDK 17+)
- Servlet (Jakarta)
- HTML
- Apache Tomcat
- Eclipse IDE

## 📁 Folder Structure
TemperatureConverter/
├── src/main/java/com/tara/TempServlet.java
├── src/main/webapp/index.html
├── src/main/webapp/WEB-INF/web.xml
├── screenshots/
└── README.md

## ⚙️ Requirements
- JDK 17+
- Eclipse IDE
- Apache Tomcat v10.1

## ▶️ How to Run
1. Import project in Eclipse
2. Configure Tomcat
3. Run project on server
4. Open:
   http://localhost:8081/TemperatureConverter/index.html

## 💡 Working
- User enters Celsius value
- Servlet converts to Fahrenheit and Kelvin
- Displays results with formulas

## 📊 Output Example
Input: 25  
Fahrenheit: 77.00  
Kelvin: 298.15  

## ❗ Error Handling
Shows error if input is not numeric
