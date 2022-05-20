package com.db.invoice.services;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.db.invoice.models.Invoice;
import com.db.invoice.repos.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.Optional;

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

    public Invoice fetchInvoice(Long invoiceId){
        Optional<Invoice> optionalInvoice= invoiceRepository.findById(invoiceId);
        if(optionalInvoice.isPresent()){
            Invoice invoice =  optionalInvoice.get();
            return invoice;
        }else{
            System.out.println("No such file in database: " + invoiceId);
            return null;
        }
        //to do exceptions
    }
    public Invoice updateInvoice(Long invoiceId, Invoice inputInvoice) {
        Invoice dbInvoice=fetchInvoice(invoiceId);
        if(dbInvoice!=null){
            dbInvoice.setAmount(inputInvoice.getAmount());
            dbInvoice.setNumber(inputInvoice.getNumber());

            return invoiceRepository.save(dbInvoice);
        }
        return null;
    }

    public Iterable<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
}
