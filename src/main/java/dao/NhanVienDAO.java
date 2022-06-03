/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import models.CNhanVien;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ASUS
 */
public class NhanVienDAO {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<CNhanVien> LayDanhSachNhanVien() {
        String sql = "select * from nhanvien";
        return template.query(sql, new RowMapper<CNhanVien>() {
            public CNhanVien mapRow(ResultSet rs, int row) throws SQLException {
                CNhanVien e = new CNhanVien();
                e.setManv(rs.getString(1));
                e.setHoten(rs.getString(2));
                e.setDiachi(rs.getString(3));
                e.setGioitinh(rs.getString(4));
                e.setLuong(rs.getInt(5));
                return e;
            }
        });
    }

    public CNhanVien TimKiem(String maNV) {
        String sql = "select * from nhanvien where manv=?";
        try {
            return template.queryForObject(sql, new Object[]{maNV}, new BeanPropertyRowMapper<>(CNhanVien.class));
        } catch (DataAccessException e) {
            return null;
        }
    }
}
