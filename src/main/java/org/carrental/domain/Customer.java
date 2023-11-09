package org.carrental.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {

    private Long id;

    private String name;

    private String phoneNumber;

    private String address;

    private String refPhoneNo;



}
