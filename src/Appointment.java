public class Appointment {
    private int appointmentId;
    private String patient;
    private String doctor;
    private String date;

    public Appointment() {
        this.appointmentId = 0;
        this.patient = null;
        this.doctor = null;
        this.date = "Not scheduled";
    }

    public Appointment(int appointmentId, String patient, String doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    // Getters & Setters
    public int getAppointmentId() { return appointmentId; }
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatient() {
        return patient;
    }
    public void setPatient(String patient) { this.patient = patient; }

    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    // Additional methods
    public boolean isAssigned() {
        return patient != null && doctor != null;
    }

    public void reschedule(String newDate) {
        this.date = newDate;
    }

    @Override
    public String toString() {
        return "Appointment [id=" + appointmentId +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", date=" + date + "]";
    }
}
