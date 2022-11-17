package ex3.PhoneBookExceptions;

public class PhoneNumberAlreadyExists extends Exception {
    public String toString() {
        String msg = "Exception: Phone number already exists";
        return msg;
    }

}
