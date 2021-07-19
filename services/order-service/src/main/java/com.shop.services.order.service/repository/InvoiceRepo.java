package com.shop.services.order.service.repository;

import com.shop.services.order.service.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepo extends CrudRepository<Invoice, Long> {
}
