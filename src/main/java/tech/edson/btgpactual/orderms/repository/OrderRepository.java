package tech.edson.btgpactual.orderms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.edson.btgpactual.orderms.controller.dto.OrderResponse;
import tech.edson.btgpactual.orderms.entity.OrderEntity;

@Repository
public interface OrderRepository extends MongoRepository<OrderEntity, Long> {


    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);

}
