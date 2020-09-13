package njust.cs1.messagesystem.dao;

import njust.cs1.messagesystem.pojo.Book;
import njust.cs1.messagesystem.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
