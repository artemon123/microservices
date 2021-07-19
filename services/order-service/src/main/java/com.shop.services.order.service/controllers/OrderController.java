package com.shop.services.order.service.controllers;

import com.shop.services.order.service.model.Invoice;
import com.shop.services.order.service.model.Manager;
import com.shop.services.order.service.model.Product;
import com.shop.services.order.service.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/v1/Orders")
public class OrderController {


    @Autowired
    InvoiceService invoiceService;


    @PostMapping("/")
    public void addInvoice(@RequestBody Invoice aInvoice)
    {
        invoiceService.saveInvoice(aInvoice);
    }

    @PutMapping("/")
    public void updateInvoice(@RequestBody Invoice aInvoice)
    {
        invoiceService.saveInvoice(aInvoice);
    }

    @GetMapping(value = "/{id}")
    public Invoice getInvoiceById(@PathVariable("id") Long id)
    {
      return invoiceService.getInvoiceById(id);
    }

    @PutMapping("/init")
    public void init()
    {
        List<Invoice> invoiceList=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            invoiceList.add(new Invoice(new Manager(), Arrays.asList(new Product(Double.valueOf(i),"2x2x2",3)), LocalDate.now()));
        }
        invoiceService.saveAll(invoiceList);
    }



}
