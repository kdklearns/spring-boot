package org.kdklearns;

import java.util.List;

public class UserService {

    private final List<String> usernames;

    public UserService(List<String> usernames) {
        System.out.println("UserService constructor invoked");
        this.usernames = usernames;
    }

    public void initMethod() {
        System.out.println("Init Method called");
    }

    public List<String> getUsernames() {
        return usernames;
    }

    public void destroyMethod() {
        System.out.println("Destroy Method called");
    }
}
