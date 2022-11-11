package Entites;
public class Shows {
    private Long showId;
    private String movieName;
    private String startTime;
    private String EndTime;
    private int screenId;
    public Long getShowId() {
        return showId;
    }
    public void setShowId(Long showId) {
        this.showId = showId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return EndTime;
    }
    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
    public int getScreenId() {
        return screenId;
    }
    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }
}
