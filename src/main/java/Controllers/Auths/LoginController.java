package Controllers.Auths;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import Models.User;
import Services.Implementations.Auths.LoginService;

import java.io.IOException;


@WebServlet("/login")
public class LoginController extends HttpServlet {

    private LoginService login = new LoginService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Show login page
        request.getRequestDispatcher("/Views/Auths/Login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = login.login(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect(
                    request.getContextPath() + "/Views/Users/home.jsp"
            );
        } else {
            request.setAttribute("error", "Sai username hoặc password");
            request.getRequestDispatcher("/Views/Auths/Login.jsp")
                    .forward(request, response);
        }
    }
}
