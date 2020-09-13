package njust.cs1.messagesystem.dao;

import njust.cs1.messagesystem.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
