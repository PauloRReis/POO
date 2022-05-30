package api.dadosAPI;

import java.util.List;

public class PersonagemReq{

    private Integer id;
    private String name;
    private String birthday;
    private List<String> occupation;
    private String status;
    private String nickname;
    private List<Integer> appearance;
    private String portrayed;
    private List<String> category;

    public PersonagemReq(){};
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public List<String> getOccupation() {
        return occupation;
    }
    public void setOccupation(List<String> occupation) {
        this.occupation = occupation;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public List<Integer> getAppearance() {
        return appearance;
    }
    public void setAppearance(List<Integer> appearance) {
        this.appearance = appearance;
    }
    public String getPortrayed() {
        return portrayed;
    }
    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }
    public List<String> getCategory() {
        return category;
    }
    public void setCategory(List<String> category) {
        this.category = category;
    }

}
