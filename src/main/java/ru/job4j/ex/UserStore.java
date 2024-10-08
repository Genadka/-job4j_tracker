package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user != null && user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found: " + login);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user != null && user.isValid() && user.getUsername().length() >= 3) {
            return true;
        }
        throw new UserInvalidException("User invalid: " + (user != null ? user.getUsername() : "unknown"));
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        User user = null;

        try {
            user = UserStore.findUser(users, "Petr Arsentev");
            System.out.println("User Petr Arsentev is found");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            if (UserStore.validate(user)) {
                System.out.println("This user has access");
            }
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
