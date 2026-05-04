package com.srushti;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/convert")
public class TempServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double c = Double.parseDouble(request.getParameter("celsius"));

            double f = (c * 9/5) + 32;
            double k = c + 273.15;

            out.println("<h2>Conversion Result</h2>");
            out.println("<p>Celsius: " + c + "</p>");
            out.println("<p>Fahrenheit: " + String.format("%.2f", f) + "</p>");
            out.println("<p>Kelvin: " + String.format("%.2f", k) + "</p>");

            out.println("<p>Formula Used:</p>");
            out.println("<p>F = (C × 9/5) + 32</p>");
            out.println("<p>K = C + 273.15</p>");

        } catch (Exception e) {
            out.println("<h3 style='color:red;'>Invalid Input! Enter numeric value.</h3>");
        }

        out.println("<br><a href='index.html'>Back</a>");
    }
}