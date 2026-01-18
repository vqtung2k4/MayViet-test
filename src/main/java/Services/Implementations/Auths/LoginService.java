package Services.Implementations.Auths;

import DAO.UserDAO;
import Services.Interfaces.Auths.ILoginService;
import Models.User;

public class LoginService implements ILoginService{
    private UserDAO userDAO = new UserDAO();

    @Override
    public User login(String username, String password) {
        return userDAO.login(username, password);
    }
}
