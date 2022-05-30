package api.dadosAPI;

import java.util.List;

public class EpisodioReq {

    private Integer id;
    private String title;
    private Integer season;
    private Integer episode;
    private String air_date;
    private List<String> characters;
    private String series;

    public EpisodioReq(){}

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
    public Integer getSeason() {
        return season;
    }
    public void setSeason(Integer season) {
        this.season = season;
    }
    public Integer getEpisode() {
        return episode;
    }
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }
    public String getAir_date() {
        return air_date;
    }
    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }
    public List<String> getCharacters() {
        return characters;
    }
    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    
}
