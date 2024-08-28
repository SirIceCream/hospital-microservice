package io.everyonecodes.springmysql.drhouseaccountancy.Controller;


import io.everyonecodes.springmysql.drhouseaccountancy.data.Patient;
import io.everyonecodes.springmysql.drhouseaccountancy.repo.PatientDTO;
import io.everyonecodes.springmysql.drhouseaccountancy.service.InvoiceService;
import io.everyonecodes.springmysql.drhouseaccountancy.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;
    private final InvoiceService invoiceService;

    public PatientController(PatientService patientService, InvoiceService invoiceService) {
        this.patientService = patientService;
        this.invoiceService = invoiceService;
    }

    @PostMapping
    public PatientDTO receivePatient(@RequestBody PatientDTO patientDTO) {
        Patient patient = patientService.findOrCreatePatient(patientDTO);
        invoiceService.generateInvoice(patient);
        return patientDTO;
    }
}
