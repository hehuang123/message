package njust.cs1.messagesystem.dao;

import njust.cs1.messagesystem.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Deletecontroller extends JpaRepository<Message,Integer> {

}
