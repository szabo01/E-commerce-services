package controller;


import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@GetMapping
	public List<Account> findAll(){
		return new ArrayList<Account>();
	}
}
