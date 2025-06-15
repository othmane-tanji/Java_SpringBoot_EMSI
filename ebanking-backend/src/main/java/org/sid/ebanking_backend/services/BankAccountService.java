package org.sid.ebanking_backend.services;

import org.sid.ebanking_backend.entities.BankAccount;
import org.sid.ebanking_backend.entities.Customer;

import java.util.List;

public interface BankAccountService {
    public Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount(double initialBalance, String type, Long customerId);
    List<Customer> listCustomers();
    BankAccount getBankAccount(String accountId);
    void debit(String account, double amount, String description);
    void credit(String account, double amount, String description);
    void transfer(String accountIdSource, String accountIdDestination, double amount);

}
