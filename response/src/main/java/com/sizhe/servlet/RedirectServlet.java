package com.sizhe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName RedirectServlet
 * @Description TODO
 * @Author Chris
 * @Date 2021/5/11
 **/
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        resp.setHeader("Location","/r/img");
        resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
         */
        resp.sendRedirect("/r/img");//重定向
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
