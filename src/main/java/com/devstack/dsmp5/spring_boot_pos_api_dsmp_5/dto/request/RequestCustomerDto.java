package com.devstack.dsmp5.spring_boot_pos_api_dsmp_5.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCustomerDto {
    private String Name;
    private String Email;
    private Double salary;
    private String address;
}
