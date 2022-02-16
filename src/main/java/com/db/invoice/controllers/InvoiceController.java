package com.db.invoice.controllers;


import com.db.invoice.models.Invoice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @PostMapping(value="/createInvoice")
    public void createInvoice(@RequestBody Invoice invoice){

    }


    @PostMapping(value="/createInvoices")
    public Iterable<Invoice> createInvoices(@RequestBody Iterable<Invoice> invoice){
        return null;
    }
}
