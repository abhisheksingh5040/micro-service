package com.te.feignclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderDTO {
	private String orderId;
	private int orderQuantity;
	private double orderAmount;
	private String productId;
	private String customerId;
}
