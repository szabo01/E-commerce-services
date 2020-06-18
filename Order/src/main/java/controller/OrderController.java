package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	
	public List<Order> findAll() {
		return new ArrayList<Order>();
	}
}
