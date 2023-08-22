package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloWorldServelt extends HttpServlet {
    public HelloWorldServelt(){
        System.out.println("无参构造");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloWorld....");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("这是服务器响应的文本信息");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
