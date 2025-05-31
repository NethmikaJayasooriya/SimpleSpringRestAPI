package com.devstack.dsmp5.spring_boot_pos_api_dsmp_5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="customer")
public class Customer {
    @Id
    @Column(name="customer_id",length=80)
    private  String id;
    @Column(name="customer_name",length = 50)
    private  String Name;
    @Column(name="customer_address",length = 50)
    private  String Address;
    @Column(name="customer_email",length = 100,unique=true)
    private  String Email;
    @Column(name="customer_salary")
    private Double salary;


}
