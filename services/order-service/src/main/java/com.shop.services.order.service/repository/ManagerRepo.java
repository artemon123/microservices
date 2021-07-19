package com.shop.services.order.service.repository;

import com.shop.services.order.service.model.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepo extends CrudRepository<Manager, Long> {
}
