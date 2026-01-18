package Controllers.Auths;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import Models.User;
import Services.Implementations.Auths.LoginService;
import Services.Interfaces.Auths.ILoginService;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private LoginService login = new LoginService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = login.login(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("Views/Users/home.jsp");
        } else {
            request.setAttribute("error", "Sai username hoặc password");
            request.getRequestDispatcher("Views/Auths/Login.jsp")
                    .forward(request, response);
        }
    }
}
