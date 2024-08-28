package io.everyonecodes.springmysql.drhouseaccountancy.repo;

public class PatientDTO {
    private String uuid;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;

    public PatientDTO() {
    }

    public PatientDTO(String uuid, String name, String symptoms, String diagnosis, String treatment) {
        this.uuid = uuid;
        this.name = name;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }
}
