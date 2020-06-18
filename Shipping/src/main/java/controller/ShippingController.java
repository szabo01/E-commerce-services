package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Shipping;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

	@GetMapping
	public List<Shipping> findAll(){
		return new ArrayList<Shipping>();
	}
}
