package com.manchesterDigital;

public class UserService {

    private static User user;

    static {
        user = new User("Andrew");
        user.setId(1L);
    } // static block. it will allow you to initialise something that is static

    public User retrieveUser(Long id) {

        if (id.equals(user.getId())) {
            return user;
        }

        throw new UserNotFoundException("User not found with given ID: " + id);

    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        User retrievedUser = userService.retrieveUser(Long.MAX_VALUE);
        System.out.println(retrievedUser.toString());
    }

}
