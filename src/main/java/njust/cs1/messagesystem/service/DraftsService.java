package njust.cs1.messagesystem.service;
import njust.cs1.messagesystem.dao.DraftsDao;
import njust.cs1.messagesystem.pojo.Drafts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DraftsService {
    @Autowired
    DraftsDao draftsDao;

    public void saveDrafts(Drafts drafts){
        draftsDao.save(drafts);
    }


}
