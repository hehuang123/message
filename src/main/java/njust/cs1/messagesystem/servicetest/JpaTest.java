package njust.cs1.messagesystem.servicetest;

import njust.cs1.messagesystem.pojo.User;
import njust.cs1.messagesystem.service.MessageService;
import njust.cs1.messagesystem.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void get(){
        System.out.println(messageService.getMessage());
    }
}
