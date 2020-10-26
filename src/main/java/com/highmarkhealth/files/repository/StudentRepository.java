package com.highmarkhealth.files.repository;

import com.highmarkhealth.files.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>,StudentCustomRepo {

}
