package ex3.PhoneBookExceptions;

public class RecordNotFound extends Exception {
    public String toString() {
        String msg = "Exception: Record not Found";
        return msg;
    }
}
