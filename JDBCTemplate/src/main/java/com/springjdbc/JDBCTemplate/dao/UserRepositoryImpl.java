package com.springjdbc.JDBCTemplate.dao;

import com.springjdbc.JDBCTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
     private  static final String INSERT_USER_QUERY="INSERT INTO user_data(id,last_name,first_name,email,address) values(?,?,?,?,?)";
     private static  final String UPDATE_USER_BY_ID_QUERY="UPDATE user_data SET first_name=? WHERE id=?";
     private  static final String GET_BY_ID_QUERY ="SELECT * FROM public.user_data WHERE id=?";
     private static final String DELETE_USER_BY_ID_QUERY=" DELETE FROM public.user_data WHERE id=?";

     private static final String GET_USER_QUERY="SELECT * FROM public.user_data";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public User insertUser(User user) {
        jdbcTemplate.update(INSERT_USER_QUERY,user.getId(),user.getLastName(),user.getFirstName(),user.getEmail(),user.getAddress());
        return user;
    }

    @Override
    public User updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER_BY_ID_QUERY,user.getFirstName(),user.getId());
        return  user;
    }

    @Override
    public User getBYId(int id) {
        return jdbcTemplate.queryForObject(GET_BY_ID_QUERY,(rs, rowNum) ->{
            return new User(rs.getInt(id),rs.getString("last_name"),rs.getString("first_name"), rs.getString("email"),rs.getString("address") );
        });
    }

    @Override
    public String deleteById(int id){
        jdbcTemplate.update(DELETE_USER_BY_ID_QUERY,id);
        return "user got delete by id"+id;

    }

    @Override
    public List<User> getAllUser() {
        return jdbcTemplate.query(GET_USER_QUERY,(rs, rowNum) -> {
            return  new User(rs.getInt("id"),rs.getString("last_name"),rs.getString("first_name"), rs.getString("email"),rs.getString("address"));
        });
    }
}
