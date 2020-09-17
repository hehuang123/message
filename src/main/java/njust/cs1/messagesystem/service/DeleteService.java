package njust.cs1.messagesystem.service;

import njust.cs1.messagesystem.dao.MessageDao;
import njust.cs1.messagesystem.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeleteService {
    @Autowired
    MessageDao messageDao;

}
