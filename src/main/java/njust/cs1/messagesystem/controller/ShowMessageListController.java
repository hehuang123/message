package njust.cs1.messagesystem.controller;

import njust.cs1.messagesystem.pojo.Message;
import njust.cs1.messagesystem.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowMessageListController {
    @Autowired
    MessageService messageService;

    @CrossOrigin
    @PostMapping("/api/messages")
    public List<Message> list(){
        return  messageService.list();
    }

    @CrossOrigin
    @PostMapping("/api/messagesAdd")
    public Message addOrUpdate(@RequestBody Message message){
        messageService.add(message);
        return message;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void delete(@RequestBody Message message){
        messageService.deleteById(message.getId());
    }

    @CrossOrigin
    @PostMapping("/api/search")
    public List<Message> searchResult(@RequestParam("keywords") String keywords){
        if ("".equals(keywords)) {
            return messageService.list();
        } else {
            return messageService.Search(keywords);
        }
    }

}
