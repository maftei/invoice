package com.db.invoice.controllers;


import com.db.invoice.models.Invoice;
import com.db.invoice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @PostMapping(value="/ ")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceService.createinvoice(invoice);
    }


    @PostMapping(value="/createInvoices")
    public Iterable<Invoice> createInvoices(@RequestBody Iterable<Invoice> invoice){
        return null;
    }
}
