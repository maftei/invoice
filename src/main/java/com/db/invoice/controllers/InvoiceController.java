package com.db.invoice.controllers;


import com.db.invoice.models.Invoice;
import com.db.invoice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @PostMapping(value="/createInvoice")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceService.createinvoice(invoice);
    }


    @PostMapping(value="/createInvoices")
    public Iterable<Invoice> createInvoices(@RequestBody Iterable<Invoice> invoice){

        return invoiceService.createInvoices(invoice);
    }

    @PutMapping(value = "/updateInvoice/{invoiceId}")
    public void updateInvoice(@PathVariable ("invoiceId") Long invoiceId, @RequestBody Invoice invoice){
            invoiceService.updateInvoice(invoiceId, invoice);
    }
}
