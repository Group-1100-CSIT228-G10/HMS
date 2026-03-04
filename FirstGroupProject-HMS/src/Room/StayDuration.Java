package Room;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StayDuration {
    private LocalDate checkIn;
    private LocalDate checkOut;

    public StayDuration(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long calculateDays() {
        long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        
        if (days <= 0) {
            System.out.println("Invalid check-in/check-out dates.");
            return 0;
        }
        return days;
    }
}