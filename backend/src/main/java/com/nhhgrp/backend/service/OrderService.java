package com.nhhgrp.backend.service;

import com.nhhgrp.backend.dto.OrderDetails;
import com.nhhgrp.backend.dto.OrderRequest;
import com.nhhgrp.backend.auth.dto.OrderResponse;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface OrderService {
    public OrderResponse createOrder(OrderRequest orderRequest, Principal principal) throws Exception;
    public Map<String,String> updateStatus(String paymentIntentId, String status);
    public List<OrderDetails> getOrdersByUser(String name);
    public void cancelOrder(UUID id, Principal principal);
}
