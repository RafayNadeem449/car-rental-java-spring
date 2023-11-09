package org.carrental.mapper;

import org.carrental.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserMapper implements IMapper<User>{

    public static final String PASS = "pass";
    public static final String USERNAME = "username";
    public static final String ID = "id";


    @Override
    public List<User> resultToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public User resultToObject(ResultSet rs) throws SQLException {
        return User.builder()
                .id(rs.getInt(ID))
                .username(rs.getString(USERNAME))
                .password(rs.getString(PASS))
                .build();
    }
}
