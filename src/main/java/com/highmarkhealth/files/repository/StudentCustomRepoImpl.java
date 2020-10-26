package com.highmarkhealth.files.repository;

import com.highmarkhealth.files.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class StudentCustomRepoImpl implements StudentCustomRepo {

  @Override
  public Student studentInfo(Integer id) {
    Student s = new Student();
    s.setId(1);
    return s;
  }
}
