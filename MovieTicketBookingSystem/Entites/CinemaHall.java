package Entites;
import java.util.List;

public class CinemaHall {
    private Long hallId;
    private String hallName;
    private String Address;
    private List<Integer> screens;
    public Long getHallId() {
        return hallId;
    }
    public void setHallId(Long hallId) {
        this.hallId = hallId;
    }
    public String getHallName() {
        return hallName;
    }
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public List<Integer> getScreens() {
        return screens;
    }
    public void setScreens(List<Integer> screens) {
        this.screens = screens;
    }

}
