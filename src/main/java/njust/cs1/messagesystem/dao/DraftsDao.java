package njust.cs1.messagesystem.dao;

import njust.cs1.messagesystem.pojo.Drafts;
import njust.cs1.messagesystem.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DraftsDao extends JpaRepository<Drafts,Integer> {

}
