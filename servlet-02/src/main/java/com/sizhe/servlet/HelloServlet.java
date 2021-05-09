package com.sizhe.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName HelloServlet
 * @Description HelloServlet
 * @Author Chris
 * @Date 2021/5/9
 **/
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameter();  初始化参数
        //this.getServletConfig();  Servlet配置
        //this.getServletContext(); Servlet上下文
        ServletContext context = this.getServletContext();

        String username = "ming";//数据
        context.setAttribute("username",username);//将一个数据保存在了ServletContext中，数据的名字为username，值为变量username的值


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
