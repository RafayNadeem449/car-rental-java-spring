package org.carrental.mapper;

import org.carrental.domain.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper implements IMapper<Customer> {


    @Override
    public  List<Customer> resultToList(ResultSet rs) throws SQLException {


        List<Customer> customerList = new ArrayList<>();

        while (rs.next())
        {

          if(rs.next())
          {
              Customer customer = Customer.builder()

                      .id((long)rs.getInt("cid"))
                      .name(rs.getString("c_name"))
                      .phoneNumber(rs.getString("phone_no"))
                      .address(rs.getString("address"))
                      .refPhoneNo(rs.getString("ref_phone_no"))
                      .build();

              customerList.add(customer);
          }


        }

        return customerList;

    }

    @Override
    public Customer resultToObject(ResultSet rs) throws SQLException {

        return Customer.builder()

                .name(rs.getString("c_name"))
                .phoneNumber(rs.getString("phone_no"))
                .address(rs.getString("address"))
                .refPhoneNo(rs.getString("ref_phone_no"))
                .build();

    }
}
