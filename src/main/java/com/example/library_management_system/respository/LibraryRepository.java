package com.example.library_management_system.respository;
import com.example.library_management_system.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Book,Long> {

    public Book findById(long id);

    @Query(value = "select * from LIBRARY_MANAGEMENT_SYSTEM where ALLOCATION_STATUS = 'NO' ",nativeQuery = true)
    public List<Book> findAvailableBooks();

    @Query(value = "select * from LIBRARY_MANAGEMENT_SYSTEM where ALLOCATION_STATUS = 'YES' ",nativeQuery = true)
    public List<Book> findAllocatedBooks();

    @Modifying
    @Transactional
    @Query(value = "update LIBRARY_MANAGEMENT_SYSTEM set ALLOCATION_STATUS = 'YES', STUDENT_NAME =:name where ID =:id",nativeQuery = true)
    public void allocateBook(@Param("id") long id,@Param("name") String studentName);

}
