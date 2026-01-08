public class Patient extends Person {
    private int age;
    private String diagnosis;

    public Patient(int id, String name, int age, String diagnosis) {
        super(id, name);
        setAge(age);
        this.diagnosis = diagnosis;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public void work() {
        System.out.println("Patient " + name + " is receiving treatment");
    }

    @Override
    public String toString() {
        return "Patient [name=" + name +
                ", age=" + age +
                ", diagnosis=" + diagnosis + "]";
    }
}


