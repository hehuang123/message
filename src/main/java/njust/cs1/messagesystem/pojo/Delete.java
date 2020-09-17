package njust.cs1.messagesystem.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import njust.cs1.messagesystem.dao.MessageDao;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Table(name = "delete")
@JsonIgnoreProperties



public class Delete {

    @Id
    @GeneratedValue
    @Column(name="id")
    int id;

    Date sendtime;
    String receivename;
    String sendname;
    String text;
    String title;
    int readsign;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReadsign() {
        return readsign;
    }

    public void setReadsign(int readsign) {
        this.readsign = readsign;
    }

}
