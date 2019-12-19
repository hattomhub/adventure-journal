package vigaristas.adventurejournal.command;

public class AdventureDto {

    private Integer id;

    private String title;

    private String sDisc;

    private String location;

    private String adventureType;

    private String imgUrl;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getsDisc() {
        return sDisc;
    }

    public void setsDisc(String sDisc) {
        this.sDisc = sDisc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdventureType() {
        return adventureType;
    }

    public void setAdventureType(String adventureType) {
        this.adventureType = adventureType;
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
        return "AdventureDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sDisc='" + sDisc + '\'' +
                ", location='" + location + '\'' +
                ", adventureType='" + adventureType + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", score=" + score +
                '}';
    }
}
