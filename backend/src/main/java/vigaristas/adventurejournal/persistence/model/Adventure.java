package vigaristas.adventurejournal.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adventure")
public class Adventure extends AbstractModel {

    private String title;
    private String sDesc;
    private String location;
    private String Type;
    private String imgUrl;
    private Integer score;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "title='" + title + '\'' +
                ", sDesc='" + sDesc + '\'' +
                ", location='" + location + '\'' +
                ", Type='" + Type + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", score=" + score +
                '}';
    }
}
