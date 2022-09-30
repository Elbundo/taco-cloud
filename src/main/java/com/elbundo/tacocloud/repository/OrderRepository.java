package com.elbundo.tacocloud.repository;

import com.elbundo.tacocloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
