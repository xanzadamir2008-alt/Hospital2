public class Patient {
    private int id;
    private String name;
    private int age;
    private String diagnosis;

    // Default constructor
    public Patient() {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
        this.diagnosis = "Not diagnosed";
    }

    // Parameterized constructor
    public Patient(int id, String name, int age, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    // Additional methods
    public boolean isAdult() {
        return age >= 18;
    }

    public void updateDiagnosis(String newDiagnosis) {
        this.diagnosis = newDiagnosis;
    }

    public String toString() {
        return "Patient [id=" + id + ", name=" + name +
                ", age=" + age + ", diagnosis=" + diagnosis + "]";
    }
}

