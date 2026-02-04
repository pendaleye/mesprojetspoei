package TP3;

public class AuthService {
    public boolean login(String username, String password){
        return "admin".equals(username)&&"1234".equals(password);
    }
}
