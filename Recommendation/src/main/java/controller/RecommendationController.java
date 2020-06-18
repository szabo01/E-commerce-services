package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Recommendation;

@RestController
@RequestMapping("/recommentation")
public class RecommendationController {

	
	@GetMapping
	public List<Recommendation> findAll() {
		return new ArrayList<Recommendation>();
	}
	
}
