package ex3.PhoneBookExceptions;

public class RecordNotValid extends Exception {
    public String toString() {
        String msg = "Exception: Record not Valid";
        return msg;
    }
}
