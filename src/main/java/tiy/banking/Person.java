package tiy.banking;

/**
 * Created by localdom on 5/6/2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public static final String DEFAULT_FIRST_NAME = "TEST_FIRST";
    public static final String DEFAULT_LAST_NAME = "TEST_LAST";
    public static final String DEFAULT_EMAIL_ADDRESS = "DEFAULT@TESTER.COM";

    public Person() {
        System.out.println("Person()");
        this.firstName = DEFAULT_FIRST_NAME;
        this.lastName = DEFAULT_LAST_NAME;
        this.emailAddress = DEFAULT_EMAIL_ADDRESS;
    }

    public Person(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
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
