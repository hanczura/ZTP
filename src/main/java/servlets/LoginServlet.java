package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String login = req.getParameter("login");
        String path = null;

        if ("admin".equals(login)) {
            path = "/adminLogin";
        } else if ("user".equals(login)) {
            path = "/userLogin";
        }
        RequestDispatcher adminDispatcher = req.getRequestDispatcher(path);
        adminDispatcher.forward(req, resp);
    }
}
