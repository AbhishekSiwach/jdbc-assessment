package com.dxc.assessment.dao;

import java.sql.SQLException;
import java.util.List;
import com.dxc.assessment.modal.Author;

public interface AuthorDao {

    int save(Author author) throws SQLException;

    List<Author> findAll() throws SQLException;
    
}