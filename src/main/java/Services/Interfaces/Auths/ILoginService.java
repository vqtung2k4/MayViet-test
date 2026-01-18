package Services.Interfaces.Auths;

import Models.User;

public interface ILoginService {
    User login (String username, String password);
}
