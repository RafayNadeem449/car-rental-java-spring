package org.carrental.dao;

import org.carrental.domain.User;
import org.carrental.mapper.UserMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAO extends BaseDAO implements ICrud<User> {


    UserMapper userMapper = new UserMapper();

    public User getbyUsernameAndPassword(String Username, String Password)
    {
        try {
            PreparedStatement ps = conn.prepareStatement(SQLQueryConstant.GET_USERNAME_AND_PASSWORD);
            ps.setString(1,Username);
            ps.setString(2,Password);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                return userMapper.resultToObject(rs);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }


        return null;

    }

    @Override
    public void insert(User obj) throws SQLException {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void update(User obj, Long id) {

    }
}
