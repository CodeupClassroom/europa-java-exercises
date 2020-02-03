
class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    public Person(Person aPerson) {
        this.setFirstName(aPerson.firstName);
        this.setLastName(aPerson.lastName);
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
}
