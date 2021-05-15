package com.sizhe.servlet;

import com.sizhe.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * @ClassName SessionDemo01
 * @Description session的存取
 * @Author Chris
 * @Date 2021/5/15
 **/
public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到Session
        HttpSession session = req.getSession();

        //给Session中存东西
        session.setAttribute("name",new Person("小明",2));

        //获取Session的ID
        String sessionId = session.getId();

        //判断Session是不是新创建
        if(session.isNew()){
            resp.getWriter().write("session创建成功，ID"+sessionId);
        }else{
            resp.getWriter().write("session已经再服务器中存在了，ID"+sessionId);
        }

        //Session创建的时候做了什么事情：
//        Cookie cookie = new Cookie("JSESSIONID", sessionId);
//        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
