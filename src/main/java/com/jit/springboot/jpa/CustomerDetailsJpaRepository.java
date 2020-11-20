package com.jit.springboot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface CustomerDetailsJpaRepository extends JpaRepository<CustomerDetails, String> {
	CustomerDetails findByEmail(String email);
	
	@Query("select cd from CustomerDetails cd")
	List<CustomerDetails> findAllByCustomQueryAndStream();
	
    @Query(value = "SELECT * FROM customer_details WHERE gender = :gender", nativeQuery = true)
    List<CustomerDetails> findCustomerDetailsByGender(@Param("gender") String gender);
	

}