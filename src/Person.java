import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName = new SimpleStringProperty();

    //return object itself
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //returns firstName value
    public String getFirstName() {
        return firstName.get();
    }

    //sets firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
