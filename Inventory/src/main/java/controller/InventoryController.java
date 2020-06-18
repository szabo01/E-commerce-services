package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Inventory;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	@GetMapping
	public List<Inventory> findAll() {
		return new ArrayList<Inventory>();
	}

}
