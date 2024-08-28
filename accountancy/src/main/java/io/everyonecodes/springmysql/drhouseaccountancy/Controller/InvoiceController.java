package io.everyonecodes.springmysql.drhouseaccountancy.Controller;

import io.everyonecodes.springmysql.drhouseaccountancy.data.Invoice;
import io.everyonecodes.springmysql.drhouseaccountancy.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @PutMapping("/{id}/paid")
    public Invoice markInvoiceAsPaid (@PathVariable Long id) {
        return invoiceService.markInvoiceAsPaid(id);
    }
}
