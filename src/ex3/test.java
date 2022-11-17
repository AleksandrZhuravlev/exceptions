package ex3;
import ex3.PhoneBookExceptions.PhoneNumberAlreadyExists;
import ex3.PhoneBookExceptions.RecordNotFound;
import ex3.PhoneBookExceptions.RecordNotValid;
import ex3.PhoneBookRe;

public class test {
    public static void main(String args[]) {
        Record serega =new Record(12_323_232, "8913556784", "Sergei Kharitonov");
        Record maria =new Record(93999593, "8913567466", "Maria Tonskaya");
        Record dmitri =new Record(78782782, "8913098790", "Dmitri Antonov");
        Record unknwn =new Record(1000001,null,null);
        PhoneBookRe book=new PhoneBookRe();

        try {
            book.createRecord(maria);
            book.createRecord(dmitri);
            book.createRecord(unknwn);;

        } catch (PhoneNumberAlreadyExists e) {
            System.out.println("Phone number already exists");
        }

        try {
            book.updateRecord(unknwn);
        } catch (RecordNotFound e) {
            System.out.println("Record not found");
        } catch (RecordNotValid e) {
            System.out.println("Record not valid");
        }


    }
}
