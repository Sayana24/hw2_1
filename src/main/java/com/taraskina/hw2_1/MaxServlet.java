package com.taraskina.hw2_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Maximum", value = "/MaxServlet")
public class MaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNumber=Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber=Integer.parseInt(req.getParameter("secondNumber"));
        int thirdNumber=Integer.parseInt(req.getParameter("thirdNumber"));

        int max = firstNumber;
        if (secondNumber > max)
            max = secondNumber;
        if (thirdNumber > max)
            max = thirdNumber;

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Entered numbers </h1>");
        out.println("<p> firstNumber:: " + firstNumber + "</p>");
        out.println("<p> secondNumber:: " + secondNumber + "</p>");
        out.println("<p> thirdNumber:: " + thirdNumber + "</p>");
        out.println("<p> max:: " + max + "</p>");
        out.println("</body></html>");
        out.close();

        System.out.println("First Number::  " + firstNumber);
        System.out.println("Second Number::  " + secondNumber);
        System.out.println("Third Number::  " + thirdNumber);
        System.out.println("Maximum ::  " + max);

    }
}
