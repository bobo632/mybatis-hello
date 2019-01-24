package com.sunyx.dao;

import com.sunyx.domain.Order;
import com.sunyx.domain.OrderUser;

import java.util.List;

/**
 * Created by liuli on 2019/1/23.
 */
public interface OrderMapper {
    public List<OrderUser> getOrderUser();
    public List<Order> getOrderUser2();
}
