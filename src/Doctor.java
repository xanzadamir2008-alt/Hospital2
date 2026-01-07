public class Doctor extends Person {
    private String specialization;
    private int experienceYears;

    public Doctor(int id, String name, String specialization, int experienceYears) {
        super(id, name);
        this.specialization = specialization;
        setExperienceYears(experienceYears);
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        }
    }

    @Override
    public void work() {
        System.out.println("Doctor " + name + " is treating patients");
    }

    public boolean isSenior() {
        return experienceYears >= 10;
    }

    @Override
    public String toString() {
        return "Doctor [name=" + name +
                ", specialization=" + specialization +
                ", experience=" + experienceYears + "]";
    }
}
