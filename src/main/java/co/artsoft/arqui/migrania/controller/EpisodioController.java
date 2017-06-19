package co.artsoft.arqui.migrania.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.artsoft.arqui.migrania.dao.MigraineDAO;
import co.artsoft.arqui.migrania.dao.FoodDAO;
import co.artsoft.arqui.migrania.entity.Food;
import co.artsoft.arqui.migrania.entity.Location;
import co.artsoft.arqui.migrania.entity.Migraine;


@Controller // This means that this class is a Controller
@RequestMapping(path = "/episodio")
public class EpisodioController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private MigraineDAO episodioRepository;
	//@Autowired // This means to get the bean called userRepository
	//private FoodDAO foodRepository;

	@GetMapping(path = "/add") // Map ONLY GET Requests
	public @ResponseBody String addNewEpisodio(@RequestParam String patron) {
		// @ResponseBody means the returned String is the response, not a view
		// name
		// @RequestParam means it is a parameter from the GET or POST request
		//if (food != null && !food.isEmpty()) {		
		//Food foodMigraine = foodRepository.findOne(Integer.parseInt(food));
		//Set<Food> g = new HashSet<Food>();
		//g.add(foodMigraine);
		//}
		Migraine n = new Migraine();
		n.setDate(new java.sql.Date(System.currentTimeMillis()));
		n.setSleepPattern(patron);
		//n.setFoods(g);
		episodioRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Migraine> getAllUsers() {
		// This returns a JSON or XML with the users
		return episodioRepository.findAll();
	}
}
