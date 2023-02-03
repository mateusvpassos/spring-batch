package br.com.mateus.batch.config;

import org.springframework.batch.item.ItemProcessor;

import br.com.mateus.batch.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(final Customer customer) throws Exception {
        return customer;
    }
}