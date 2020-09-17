package njust.cs1.messagesystem.dao;

import njust.cs1.messagesystem.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageDao extends JpaRepository<Message,Integer> {

    Message findById(int id);
    List<Message> findAllByTitleLike(String keywords);
}
