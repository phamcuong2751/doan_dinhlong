package dao;

import models.MUsers;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AuthenticationDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private static String SELECT_ALL_USER = "SELECT * FROM users";
    private static String SELECT_USER_BY_USERNAME = "SELECT * FROM users WHERE username = ?";

    /**
     * @return
     * @function get all user for administrator
     */
    public List<MUsers> getAllListUsers() {
        try {
            return template.query(SELECT_ALL_USER, new RowMapper<MUsers>() {
                @Override
                public MUsers mapRow(ResultSet resultSet, int i) throws SQLException {
                    MUsers user = new MUsers();
                    user.setId(resultSet.getInt("id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    user.setFrist_name(resultSet.getString("frist_name"));
                    user.setMid_name(resultSet.getString("mid_name"));
                    user.setLast_name(resultSet.getString("last_name"));
                    user.setAddress(resultSet.getString("address"));
                    user.setPhone_no(resultSet.getString("phone_no"));
                    user.setGender(resultSet.getString("gender"));
                    user.setBirthday(resultSet.getDate("birthday"));
                    user.setUser_level(resultSet.getInt("user_level"));
                    user.setCreated_date(resultSet.getDate("created_date"));
                    user.setUpdate_date(resultSet.getDate("update_date"));
                    return user;
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * @param username
     * @return
     * @function get user by username for login or authentication
     */
    public MUsers FindUserByUsername(String username) {
        try {
            return (MUsers) template.queryForObject(
                    SELECT_USER_BY_USERNAME,
                    new Object[]{username},
                    new BeanPropertyRowMapper<>(MUsers.class));

        } catch (DataAccessException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
