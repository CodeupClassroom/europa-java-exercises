public class Person {
    
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    public static void main(String[] args) {
        Person a = new Person("Elmo", "Sesame");

        System.out.println(a.sayHello());

        Person person1 = new Person("John", "Doe");
        Person person2 = person1;
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());
        person2.setFirstName("Jane");
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());

    }
}
