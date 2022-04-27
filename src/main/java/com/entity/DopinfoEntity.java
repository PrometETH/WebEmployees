package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "dopinfo")
public class DopinfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "salary")
    private int salary;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city")
    private String city;
    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private EmployeesEntity employees;


    public DopinfoEntity() {
    }

    public DopinfoEntity(int salary, String phoneNumber, String city, String email) {
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeesEntity getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeesEntity employees) {
        this.employees = employees;
    }


}
