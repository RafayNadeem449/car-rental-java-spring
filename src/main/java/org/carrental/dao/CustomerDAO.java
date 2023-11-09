package org.carrental.dao;

import org.carrental.domain.Customer;
import org.carrental.mapper.CustomerMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends BaseDAO implements ICrud<Customer> {

    private final CustomerMapper customerMapper = new CustomerMapper();

    @Override
    public void insert(Customer obj) throws SQLException {


        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.INSERT_INTO_CUSTOMER);


            ps.setString(1, obj.getName());
            ps.setString(2, obj.getPhoneNumber());
            ps.setString(3, obj.getAddress());
            ps.setString(4, obj.getRefPhoneNo());

           ps.executeUpdate();



        } catch (SQLException e) {
            System.out.println(e);
        }



    }

    @Override
    public List<Customer> getAll() {


        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQLQueryConstant.GET_ALL_CUSTOMER);

            return customerMapper.resultToList(rs);

        }
        catch(SQLException e) {

            throw new RuntimeException(e);

        }



    }

    @Override
    public Customer getById(Long id) {
        return null;
    }

    @Override
    public void update(Customer obj, Long id) {


        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQLQueryConstant.UPDATE_CUSTOMER_BY_ID);
            ps.setString(1,obj.getName());
            ps.setInt(2,id.intValue());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}
