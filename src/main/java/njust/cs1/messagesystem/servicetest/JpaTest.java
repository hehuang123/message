package njust.cs1.messagesystem.servicetest;

import njust.cs1.messagesystem.pojo.Drafts;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Autowired
    private DraftsService draftsService=new DraftsService();
    Drafts drafts=new Drafts();


    @Test
    public void get(){
        drafts.setSendname("xyz");
        drafts.setReceivename("xyz");
        drafts.setTitle("hello world!");
        drafts.setText("Today is a beautiful day");
        drafts.setExpectedsendtime(new java.sql.Date(new java.util.Date().getTime()));
        System.out.println(new java.sql.Date(new java.util.Date().getTime()));
        draftsService.saveDrafts(drafts);
    }
}
