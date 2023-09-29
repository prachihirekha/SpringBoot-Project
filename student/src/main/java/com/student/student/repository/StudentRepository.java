package com.student.student.repository;

import com.student.student.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<User,Integer> {

}
