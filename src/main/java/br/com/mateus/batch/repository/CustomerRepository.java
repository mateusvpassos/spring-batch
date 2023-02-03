package br.com.mateus.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.batch.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}