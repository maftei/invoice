package com.db.invoice.repos;

import com.db.invoice.models.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository  extends CrudRepository<Invoice, Long> {
}
