package org.carrental.dao;

public class SQLQueryConstant {


    public final static String GET_ALL_CUSTOMER = "SELECT * FROM Customer";


    public final static String INSERT_INTO_CUSTOMER = "INSERT INTO Customer(c_name,phone_no,address,ref_phone_no) " +
            "VALUES(?,?,?,?)";

    public final static String UPDATE_CUSTOMER_BY_ID = "UPDATE Customer SET c_name=? WHERE cid=?";


    public final static String GET_USERNAME_AND_PASSWORD = "SELECT * FROM User WHERE username = ? AND pass = ?";



}
