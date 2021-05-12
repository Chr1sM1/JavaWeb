package com.sizhe.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

/**
 * @ClassName CookieDemo03
 * @Description Cookie中文数据传递
 * @Author Chris
 * @Date 2021/5/13
 **/

//中文数据传递
public class CookieDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        //Cookie,服务器端从客户端获取
        Cookie[] cookies = req.getCookies();//这里返回数组，说明Cookie可能存在多个

        //判断Cookie是否存在
        if (cookies!=null){
            //如果存在怎么办
            out.write("你上一次访问的时间是：");
            for (int i = 0; i <cookies.length ; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的名字
                if("name".equals(cookie.getName())){
                    //解码
                    out.write(URLDecoder.decode(cookie.getValue(),"utf-8"));
                }
            }
        }else{
            out.write("这时你第一次访问本站");
        }

        //服务给客户端响应一个cookie
        //编码
        Cookie cookie = new Cookie("name", URLEncoder.encode("小明","utf-8"));
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
