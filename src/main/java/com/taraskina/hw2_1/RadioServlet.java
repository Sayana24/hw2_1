package com.taraskina.hw2_1;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "More", value = "/RadioServlet")

public class RadioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNumber = Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber = Integer.parseInt(req.getParameter("secondNumber"));
        int thirdNumber = Integer.parseInt(req.getParameter("thirdNumber"));
        String sel = req.getParameter("select");


        int max = firstNumber;
        if (secondNumber > max)
            max = secondNumber;
        if (thirdNumber > max)
            max = thirdNumber;

        int min = firstNumber;
        if (secondNumber < min)
            min = secondNumber;
        if (thirdNumber < min)
            min = thirdNumber;

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Entered numbers </h1>");
        out.println("<p> firstNumber:: " + firstNumber + "</p>");
        out.println("<p> secondNumber:: " + secondNumber + "</p>");
        out.println("<p> thirdNumber:: " + thirdNumber + "</p>");
        if (sel.compareTo("max") == 0)
            out.println("<p> Select:: " + max + "</p>");
        if (sel.compareTo("min") == 0)
            out.println("<p> Select:: " + min + "</p>");
        if (sel.compareTo("average") == 0)
            out.println("<p> Select:: " + average + "</p>");



        out.println("</body></html>");
        out.close();


        System.out.println("First Number::  " + firstNumber);
        System.out.println("Second Number::  " + secondNumber);
        System.out.println("Third Number::  " + thirdNumber);
        if (sel.compareTo("max") == 0)
            System.out.println("Answer ::  " + max);
        if (sel.compareTo("min") == 0)
            System.out.println("Answer ::  " + min);
        if (sel.compareTo("average") == 0)
            System.out.println("Answer ::  " + average);
    }
}
