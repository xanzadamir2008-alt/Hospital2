public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private int experienceYears;

    public Doctor() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
        this.experienceYears = 0;
    }

    public Doctor(int id, String name, String specialization, int experienceYears) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    // Additional methods
    public boolean isSeniorDoctor() {
        return experienceYears >= 10;
    }

    public void addExperience(int years) {
        this.experienceYears += years;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name +
                ", specialization=" + specialization +
                ", experienceYears=" + experienceYears + "]";
    }
}
