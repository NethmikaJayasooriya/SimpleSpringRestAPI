package com.devstack.dsmp5.spring_boot_pos_api_dsmp_5.repository;

import com.devstack.dsmp5.spring_boot_pos_api_dsmp_5.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {


}
