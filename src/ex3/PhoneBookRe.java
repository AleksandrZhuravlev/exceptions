package ex3;

import ex3.PhoneBookExceptions.PhoneNumberAlreadyExists;
import ex3.PhoneBookExceptions.RecordNotFound;
import ex3.PhoneBookExceptions.RecordNotValid;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookRe {
    private List<Record> phones = new ArrayList<>();

    public PhoneBookRe() {
        this.phones = (List<Record>) phones;
    }

    public List<Record> getAllRecords() {
        return this.phones;
    }

    public void createRecord(Record record) throws PhoneNumberAlreadyExists {
        if (phones.contains(record)) {
            throw new PhoneNumberAlreadyExists();
        } else {
            this.phones.add(record);
        }
    }

    public void updateRecord(Record record) throws RecordNotValid, RecordNotFound {
        if (!phones.contains(record)) {
            throw new RecordNotFound();
        }
        if (record.getName() == null || record.getPhoneNumber() == null) {
            throw new RecordNotValid();
        }
        int recnumber=phones.indexOf(record);
        phones.remove(recnumber);
        phones.add(record);
    }

    public void deleteRecord(long id) throws RecordNotFound {
        boolean recordExists=false;
        for (Record rec :phones) {
            if (rec.getId()==id) {
                recordExists=true;
                phones.remove(rec);
            }
        }
        if (recordExists==false) {
            throw new RecordNotFound();
        }

    }

}





