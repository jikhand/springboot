package com.jit.springboot.jpa;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailsJpaRepositoryController {

	@Autowired
	CustomerDetailsJpaRepository customerDetailsCRS;

	@PostMapping("/customer-details-save")
	public <S extends CustomerDetails> S save(@RequestBody S entity) {
		return customerDetailsCRS.save(entity);
	}

	@GetMapping("/customer-details-find-by-id/{id}")
	public Optional<CustomerDetails> findById(@PathVariable String id) {
		return customerDetailsCRS.findById(id);
	}

	@GetMapping("/customer-details-find-all")
	public Iterable<CustomerDetails> findAll() {
		return customerDetailsCRS.findAll();
	}

	@GetMapping("/customer-details-count")
	public Long count() {
		return customerDetailsCRS.count();
	}

	@GetMapping("/customer-details-exists-by-id/{id}")
	public boolean existsById(@PathVariable String id) {
		return customerDetailsCRS.existsById(id);
	}

	@GetMapping("/customer-details-find-by-email/{email}")
	public CustomerDetails findByEmail(@PathVariable String email) {
		return customerDetailsCRS.findByEmail(email);
	}
	@GetMapping("/customer-details-find-all-of-page/{pageNo}/{pageSize}")
	public List<CustomerDetails> findAllOfPage(@PathVariable("pageNo") int pageNo,@PathVariable("pageSize") int pageSize){
		return customerDetailsCRS.findAll(PageRequest.of(pageNo,pageSize)).toList();
		
	}
	@GetMapping("/findAllByCustomQueryAndStream")
	List<CustomerDetails> findAllByCustomQueryAndStream(){
		return customerDetailsCRS.findAllByCustomQueryAndStream();
	}
	@GetMapping("/findCustomerDetailsByGender/{gender}")
	List<CustomerDetails> findCustomerDetailsByGender(@PathVariable String gender){
		return customerDetailsCRS.findCustomerDetailsByGender(gender);
	}

}
