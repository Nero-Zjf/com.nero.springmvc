package handler;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeeHttpRequestHandler implements HttpRequestHandler{
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "Employee Hello world");
        request.getRequestDispatcher("/WEB-INF/content/welcome.jsp").forward(request,response);
    }
}
