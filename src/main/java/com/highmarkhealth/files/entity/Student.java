package com.highmarkhealth.files.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Data
public class Student {
  @Id private Integer id;

  private String name;
  private String address;
}
