package Services.Interfaces.Auths;

import Models.User;

public interface ISignUpService {
    boolean register(User user);

    boolean isUsernameExists(String username);

    boolean isEmailExists(String email);
}
