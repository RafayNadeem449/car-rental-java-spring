package org.carrental;

import org.carrental.dao.CustomerDAO;
import org.carrental.domain.Customer;
import org.carrental.ui.HomeUI;
import org.carrental.ui.LoginUI;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//
//        CustomerDAO customerDAO = new CustomerDAO();
//
//        customerDAO.getAll().forEach(System.out::println);
//
//        Customer newCustomer = Customer.builder()
//                .name("Talha")
//                .phoneNumber("0302929292")
//                .refPhoneNo("03223366787")
//                .build();
//
//
//
//
//
//      customerDAO.insert(newCustomer);
//
//
//
//      customerDAO.update(newCustomer,2L);
//
//        customerDAO.getAll().forEach(System.out::println);



        new HomeUI();

    }
}