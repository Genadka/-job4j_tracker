package oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.message = massage;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 1, "ошибка №1");
        error1.printInfo();
        Error error2 = new Error(true, 2, "ошибка №2");
        error2.printInfo();
        Error noterror = new Error(false, 0, "нет ошибки");
        noterror.printInfo();
    }
}
