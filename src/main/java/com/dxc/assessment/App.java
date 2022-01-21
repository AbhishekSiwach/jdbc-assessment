package com.dxc.assessment;
import java.sql.SQLException;
import java.util.List;
import com.dxc.assessment.dao.AuthorDao;
import com.dxc.assessment.modal.Author;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        findAllAuthors();
}
static void findAllAuthors(){
    class AuthorDao extends Author{

        public List<Author> findAll() {
            return null;
        }}    
    AuthorDao dao = new AuthorDao();
    try {
        List<Author> authors = dao.findAll();
        if (authors.size() == 0) {
            System.out.println("No authors found");
            return;
        }
        authors.forEach(at -> System.out.println(at));
    } catch (SQLException e) {
        e.printStackTrace();
        System.err.println(e.getMessage());
    }

}
static void createAuthors() {
    Author RuskinMoore = new Author(123, "Ruskin", "Moore","Scifi","Rmoore@gmaio.com");
    Author AbhishekSiwach = new Author(231, "Abhishek", "Siwach","Adventure","Asiwach@gmail.com");
   

    List<Author> authors = List.of(RuskinMoore, AbhishekSiwach);
    class AuthorDao extends Author{
        public List<Author> findAll() {
            return null;}}
    AuthorDao authorDao = new AuthorDao();

    authors.forEach(at -> {
        try {
            int rows = authorDao.save(at);
            System.out.println("Rows affected: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    });
}
}
