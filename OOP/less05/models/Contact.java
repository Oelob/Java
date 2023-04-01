package OOP.less05.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Contact {
    private static final AtomicInteger count = new AtomicInteger(0);
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String phonenumber;

    public Contact(int id, String firstname, String lastname, String phonenumber){
        this.id = count.incrementAndGet();
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return String.format("%d %s %s %s", this.id, this.firstname, this.lastname, this.phonenumber);
    }
    

}
