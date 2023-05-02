package com.example.fines_saveurs.servlet;

import com.example.fines_saveurs.dao.CategoryDao;
import com.example.fines_saveurs.dao.CategoryJdbcDao;
import com.example.fines_saveurs.model.Category;
import com.example.fines_saveurs.service.CategoryService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet(urlPatterns = DeleteCategoryServlet.URL)
public class DeleteCategoryServlet extends HttpServlet {
    public static final String URL = "/secured/delete-category";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));


        CategoryDao categoryDao = (CategoryDao) new CategoryService();
        Category category = new Category(id);
        categoryDao.delete(category);
        response.sendRedirect(request.getContextPath() + "/secured/categories");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
