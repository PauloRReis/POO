package api.dadosAPI;

import java.util.List;

@Lombok
public class EpisodioReq {

    private Integer id;
    private String title;
    private Integer season;
    private Integer episode;
    private String air_date;
    private List<String> characters;
    private String series;
    
}
