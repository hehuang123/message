package njust.cs1.messagesystem.service;

import njust.cs1.messagesystem.dao.MessageDao;
import njust.cs1.messagesystem.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageDao messageDao;

    public String getMessage() {
        Message message= messageDao.findById(1);
        return  message.getText();
    }
}
