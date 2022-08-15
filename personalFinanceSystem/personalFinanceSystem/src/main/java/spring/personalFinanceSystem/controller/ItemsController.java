package spring.personalFinanceSystem.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import spring.personalFinanceSystem.business.ItemService;
import spring.personalFinanceSystem.entities.Itemm;


@RestController
@RequestMapping("/items")
public class ItemsController {
	
	
	private ItemService itemService;
	
	@Autowired
	public ItemsController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}

	@PostMapping("/getall")
	public List<Itemm> getAll(){
		return this.itemService.getAll();
	}
	
	@PostMapping("/save")
		private Itemm save(@RequestBody Itemm a) {

		return this.itemService.save(a);
	}
	@DeleteMapping(path="/delete/{id}" )
	public void delete(@PathVariable Integer id) {
		this.itemService.delete(id);
	}
	@GetMapping("/count")
	public Long count() {
		return this.itemService.count();
	}
	
	@GetMapping("/findOne/{id}")
	public Optional<Itemm> findOne(@PathVariable Integer id) {
		return this.itemService.findOne(id);
	}
	
	
	@PostMapping("/exist/{primaryKey}")
	public boolean exists(@PathVariable Integer primaryKey) {
		return this.itemService.exists(primaryKey);
	}
	

	@PutMapping("/update")
	private Itemm update(@RequestBody Itemm a) {
		return this.itemService.save(a);
	}
	
	
}