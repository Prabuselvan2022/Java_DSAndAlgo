package collections;

public class Student {
    private String firstname;
    private String lastname;

    public Student( String firstname, String lastname ) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname( ) {
        return firstname;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname;
    }

    public String getLastname( ) {
        return lastname;
    }


    @Override
    public String toString( ) {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }


}
