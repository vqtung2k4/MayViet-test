package Controllers.Auths;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Models.User;
import Services.Interfaces.Auths.ISignUpService;
import Services.Implementations.Auths.SignUpService;

import java.io.IOException;

@WebServlet("/signup")
@MultipartConfig
public class SignUpController extends HttpServlet {

    private ISignUpService signUpService;

    @Override
    public void init() {
        signUpService = new SignUpService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String fullName = request.getParameter("fullname");
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Validate password
        if (!password.equals(confirmPassword)) {
            request.setAttribute("error", "Passwords do not match");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        if (signUpService.isUsernameExists(username)) {
            request.setAttribute("error", "Username already exists");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        if (signUpService.isEmailExists(email)) {
            request.setAttribute("error", "Email already exists");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        User user = new User(fullName, username, phone, email, password);

        boolean success = signUpService.register(user);

        if (success) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("error", "Sign up failed");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
    }
}
