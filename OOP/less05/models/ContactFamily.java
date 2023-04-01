package OOP.less05.models;

public class ContactFamily extends Contact{

    protected String relative;


    public ContactFamily(int id, String firstname, String lastname, String phonenumber, String relative) {
        super(id, firstname, lastname, phonenumber);
        this.relative = relative;
    }
    public void setRelative(String relative) {
        this.relative = relative;
    }
    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), this.relative);
    }
    
}
