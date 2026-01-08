public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void work() {
        System.out.println("Person is working");
    }

    public String getName() {
        return name;
    }
}
