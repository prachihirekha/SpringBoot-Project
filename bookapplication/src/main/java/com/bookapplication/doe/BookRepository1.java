package com.bookapplication.doe;

import com.bookapplication.model.Book1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository1 extends JpaRepository<Book1,Integer> {


}
