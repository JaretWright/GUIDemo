package guidemo;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author jwright
 */
public class Person {
    private SimpleStringProperty firstName, lastName;
    private LocalDate birthday;

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge()
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
}
