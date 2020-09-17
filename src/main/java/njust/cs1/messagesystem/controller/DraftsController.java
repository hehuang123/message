package njust.cs1.messagesystem.controller;

import njust.cs1.messagesystem.pojo.Drafts;
import njust.cs1.messagesystem.service.DraftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraftsController {
    @Autowired
    DraftsService draftsService;

    @CrossOrigin
    @PostMapping("/api/edit")
    public Drafts addOrUpdate(@RequestBody Drafts drafts) throws Exception {
        draftsService.saveDrafts(drafts);
        return drafts;
    }


}
