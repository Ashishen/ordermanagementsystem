package com.order.item.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderItemNotFoundException extends RuntimeException {

	public OrderItemNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItemNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
