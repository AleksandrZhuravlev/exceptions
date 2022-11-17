package ex3;


public class Record {
    private long id;
    private final String PhoneNumber;
    private final String name;

    public Record(long id, String PhoneNumber, String name) {
        this.id = id;
        this.PhoneNumber = PhoneNumber;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Record[" +
                "id=" + id + ", " +
                "PhoneNumber=" + PhoneNumber + ", " +
                "getName=" + name + ']';
    }
}

