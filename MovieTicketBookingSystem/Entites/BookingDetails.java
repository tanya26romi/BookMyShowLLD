package Entites;
import java.util.List;

public class BookingDetails {
    private Long bookingId;
    private UserInfo user;
    private String seatType;
    private List<Integer> seats;
    private String dateOfBooking;
    private BookingStatus bookingStatus;
    private Shows show;
    private double amount;
    public Long getBookingId() {
        return bookingId;
    }
    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public UserInfo getUser() {
        return user;
    }
    public void setUser(UserInfo user) {
        this.user = user;
    }
    public String getSeatType() {
        return seatType;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    public List<Integer> getSeats() {
        return seats;
    }
    public void setSeats(List<Integer> seats) {
        this.seats = seats;
    }
    public String getDateOfBooking() {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    public Shows getShow() {
        return show;
    }
    public void setShow(Shows show) {
        this.show = show;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
