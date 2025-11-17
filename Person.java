import java.time.LocalDate;

public abstract class Person {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected LocalDate birthDate;
    protected String email;
    protected String phone;

    public Person(int id, String lastName, String firstName, LocalDate birthDate,
                  String email, String phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
}
