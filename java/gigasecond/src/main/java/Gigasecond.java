import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Gigasecond {

    private long seconds;

    public Gigasecond(LocalDate moment) {
        this.seconds = moment.toEpochSecond(LocalTime.of(0, 0), ZoneOffset.ofHoursMinutes(5, 30));
    }

    public Gigasecond(LocalDateTime moment) {
        this.seconds = moment.toEpochSecond(ZoneOffset.ofHoursMinutes(5, 30));
    }

    public LocalDateTime getDateTime() {
        this.seconds += 1000000000L;
        return LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.ofHoursMinutes(5, 30));
    }
}
