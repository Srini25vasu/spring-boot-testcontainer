package com.jusmore.user.service.userservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
//@Audited
@Table(name = "users")
public class UserEntity {

  @Id
  @GeneratedValue(generator = "uuid2", strategy = GenerationType.SEQUENCE)
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  private UUID id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email_address")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "address")
  private String address;

}
