public class Tutor extends Person {
    private String description;

    public Tutor(int id, String lastName, String firstName,
                 LocalDate birthDate, String email, String phone,
                 String description) {
        super(id, lastName, firstName, birthDate, email, phone);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
