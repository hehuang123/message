package njust.cs1.messagesystem.servicetest;

import njust.cs1.messagesystem.pojo.Drafts;
import njust.cs1.messagesystem.pojo.Message;
import njust.cs1.messagesystem.pojo.User;
import njust.cs1.messagesystem.service.DraftsService;
import njust.cs1.messagesystem.service.MessageService;
import njust.cs1.messagesystem.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    MessageService messageService=new MessageService();
    @Test
    public void get(){
        List<Message> messageList;
        messageList=messageService.list();
        System.out.println(messageList.get(1).getText());
    }
}
