package com.example.payment;

import org.springframework.context.annotation.Configuration;


public class CardPayment implements IPaymentProcess{

	@Override
	public void payBill() {
		System.out.println("pay using card");
		
	}

}
