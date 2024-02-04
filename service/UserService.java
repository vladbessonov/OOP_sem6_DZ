package service;
import data.User;

public interface UserService <T extends User>{
    void create (String lastName, String firstName, String secondName);

    

}
