package njust.cs1.messagesystem.service;

import njust.cs1.messagesystem.dao.MessageDao;
import njust.cs1.messagesystem.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageDao messageDao;

    /**
     *
     * @param id 消息的id号
     * @return 根据消息的id号返回整个消息本身
     */
    public Message getMessage(int id) {
        Message message= messageDao.findById(id);
        return  message;
    }

    /**
     * 将新的短消息message保存
     * @param message 将要保存的短消息
     */
    public void add(Message message){
        messageDao.save(message);
    }
}
