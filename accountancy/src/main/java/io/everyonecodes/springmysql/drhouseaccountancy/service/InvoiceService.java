package io.everyonecodes.springmysql.drhouseaccountancy.service;


import io.everyonecodes.springmysql.drhouseaccountancy.data.Invoice;
import io.everyonecodes.springmysql.drhouseaccountancy.data.Patient;
import io.everyonecodes.springmysql.drhouseaccountancy.repo.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice generateInvoice (Patient patient) {
        Invoice invoice = new Invoice();
        invoice.setPatient(patient);
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice markInvoiceAsPaid(Long id) {
        Invoice invoice = invoiceRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invoice not found"));
        invoice.setPaid(true);
        return invoiceRepository.save(invoice);
    }
}
