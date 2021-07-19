package com.shop.services.order.service.service;

import com.shop.services.order.service.model.Invoice;
import com.shop.services.order.service.repository.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class InvoiceService {


    @Autowired
    InvoiceRepo invoiceRepo;

    public boolean saveInvoice(Invoice aInvoice) {
        try {
            invoiceRepo.save(aInvoice);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public boolean saveAll(List<Invoice> aInvoiceList) {
        try {
            invoiceRepo.saveAll(aInvoiceList);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }


    public Invoice getInvoiceById(Long aId)
    {
       return  invoiceRepo.findById(aId).orElseThrow(NoSuchElementException::new);
    }

}
