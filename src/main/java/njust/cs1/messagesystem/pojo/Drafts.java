package njust.cs1.messagesystem.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "drafts")
@JsonIgnoreProperties
public
class Drafts {

    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;

    java.util.Date expectedsendtime;
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

    public java.util.Date getExpectedsendtime() {
        return expectedsendtime;
    }

    public void setExpectedsendtime(Date expectedsendtime) {
        this.expectedsendtime = expectedsendtime;
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
