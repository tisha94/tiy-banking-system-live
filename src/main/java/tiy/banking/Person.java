package tiy.banking;

/**
 * Created by localdom on 5/6/2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person() {
        System.out.println("Person()");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
