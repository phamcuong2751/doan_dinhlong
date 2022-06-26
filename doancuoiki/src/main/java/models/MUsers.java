package models;

import java.util.Date;

public class MUsers {
    private int id;
    private String username;
    private String password;
    private String frist_name;
    private String mid_name;
    private String last_name;
    private String address;
    private String phone_no;
    private String gender;
    private Date birthday;
    private int user_level;
    private Date created_date;
    private Date update_date;

    public MUsers() {
    }

    public MUsers(int id, String username, String password, String frist_name, String mid_name, String last_name, String address, String phone_no, String gender, Date birthday, int user_level, Date created_date, Date update_date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.frist_name = frist_name;
        this.mid_name = mid_name;
        this.last_name = last_name;
        this.address = address;
        this.phone_no = phone_no;
        this.gender = gender;
        this.birthday = birthday;
        this.user_level = user_level;
        this.created_date = created_date;
        this.update_date = update_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFrist_name(String frist_name) {
        this.frist_name = frist_name;
    }
    public String getMid_name() {
        return mid_name;
    }
    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public int getUser_level() {
        return user_level;
    }
    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }
    public Date getCreated_date() {
        return created_date;
    }
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    public Date getUpdate_date() {
        return update_date;
    }
    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}
