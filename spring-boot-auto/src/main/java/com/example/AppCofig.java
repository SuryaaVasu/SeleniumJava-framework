package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.payment.CardPayment;
import com.example.payment.NetBanking;

import com.example.payment.UpiPayment;

@Configuration
//cls with bean defintion
public class AppCofig {
	
	@Bean
	@Primary
	CardPayment cardpay() {
		return new CardPayment();
	}//this bean definition create object for those class
	@Bean
	UpiPayment upipay() {
		return new UpiPayment();
	}
	@Bean
	NetBanking netpay() {
		return new NetBanking();
	}
}
