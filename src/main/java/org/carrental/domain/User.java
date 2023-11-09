package org.carrental.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private int id;

    private String username;

    private String password;



}
