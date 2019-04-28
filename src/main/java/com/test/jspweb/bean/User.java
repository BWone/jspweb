package com.test.jspweb.bean;

public class User {
    private Integer id;
    private String usn;
    private String pwd;
    private Double salary;

    public User() {
    }

    //给select * from  来使用
    public User(Integer id, String usn, String pwd, Double salary) {
        this.id = id;
        this.usn = usn;
        this.pwd = pwd;
        this.salary = salary;
    }

    //无主键构造器 给insert使用，不需要知道主键
    public User(String usn, String pwd, Double salary) {
        this.usn = usn;
        this.pwd = pwd;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usn='" + usn + '\'' +
                ", pwd='" + pwd + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
