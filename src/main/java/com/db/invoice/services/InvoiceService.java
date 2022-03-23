package com.db.invoice.services;


import com.db.invoice.models.Invoice;
import com.db.invoice.repos.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public Invoice createinvoice(Invoice invoice) {
        Invoice invoiceDb= invoiceRepository.save(invoice);
        return invoice;
    }

    public Iterable<Invoice> createInvoices(Iterable<Invoice> invoice) {
        Iterable<Invoice> dbInvoice= invoiceRepository.saveAll(invoice);
        return dbInvoice;
    }

    public void updateInvoice(Long invoiceId, Invoice invoice) {
    }
}
