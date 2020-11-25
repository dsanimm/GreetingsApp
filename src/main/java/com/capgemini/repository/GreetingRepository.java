package com.capgemini.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.Greeting;


public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}