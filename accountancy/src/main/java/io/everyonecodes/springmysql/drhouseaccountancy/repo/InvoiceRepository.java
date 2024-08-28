package io.everyonecodes.springmysql.drhouseaccountancy.repo;

import io.everyonecodes.springmysql.drhouseaccountancy.data.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
