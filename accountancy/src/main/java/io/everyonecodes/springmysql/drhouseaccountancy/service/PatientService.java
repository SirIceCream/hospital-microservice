package io.everyonecodes.springmysql.drhouseaccountancy.service;


import io.everyonecodes.springmysql.drhouseaccountancy.data.Patient;
import io.everyonecodes.springmysql.drhouseaccountancy.repo.PatientDTO;
import io.everyonecodes.springmysql.drhouseaccountancy.repo.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient findOrCreatePatient (PatientDTO patientDTO) {
        Optional<Patient> oPatient = patientRepository.findByUuid(patientDTO.getUuid());
        if (oPatient.isPresent()) {
            return oPatient.get();
        } else {
            Patient patient = new Patient();
            patient.setUuid(patientDTO.getUuid());
            patient.setName(patientDTO.getName());
            patient.setSymptoms(patientDTO.getSymptoms());
            patient.setDiagnosis(patientDTO.getDiagnosis());
            patient.setTreatment(patientDTO.getTreatment());
            return patientRepository.save(patient);
        }
    }
}
