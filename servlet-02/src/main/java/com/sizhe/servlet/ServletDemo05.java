package com.sizhe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName ServletDemo05
 * @Description 读取资源文件
 * @Author Chris
 * @Date 2021/5/10
 **/
public class ServletDemo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/sizhe/servlet/aa" +
                ".properties");
        Properties prop = new Properties();
        prop.load(is);
        String user = prop.getProperty("username");
        String pwd = prop.getProperty("password");

        resp.getWriter().println(user+":"+pwd);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
