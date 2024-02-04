package controller;
import data.User;

public interface UserControler<T extends User> {
    void create(String lastName, String firstName, String secondName);

    void sendOnConsole();

}
