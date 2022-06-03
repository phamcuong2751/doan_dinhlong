package dao;

import models.MTaiKhoan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TaiKhoanDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<MTaiKhoan> LayDanhSachTaIKhoan() {
        String sql = "select * from taikhoan";
        return template.query(sql, new RowMapper<MTaiKhoan>() {
            public MTaiKhoan mapRow(ResultSet rs, int row) throws SQLException {
                MTaiKhoan e = new MTaiKhoan();
                e.setUsername(rs.getString(1));
                e.setHoten(rs.getString(2));
                e.setDiachi(rs.getString(3));
                e.setSdt(rs.getString(4));
                e.setChucnang(rs.getString(5));
                return e;
            }
        });
    }
}
