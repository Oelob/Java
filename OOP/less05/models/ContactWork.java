package OOP.less05.models;

public class ContactWork extends Contact {

    protected String organization;
    protected String possition;

    public ContactWork(int id, String firstname, String lastname, String phonenumber, String organization, String possition) {
        super(id, firstname, lastname, phonenumber);
        this.organization = organization;
        this.possition = possition;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public void setPossition(String possition) {
        this.possition = possition;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), this.organization, this.possition);
    }
}
