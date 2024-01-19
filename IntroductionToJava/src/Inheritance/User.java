package Inheritance;

public class User {
    int user_id;
    protected String email;
    private String password;


    String getPassword(){
        return password;
    }
    void setPassword(String newPassword){
        this.password = newPassword;
    }

}
