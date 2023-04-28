package com.example.fines_saveurs.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ProductsServlet", urlPatterns = {"/secured/products"})
public class ProductsServlet extends HttpServlet {

    public static final String URL = "/products";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/products.jsp").forward(request, response);
    }

}
