import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;
import java.util.*;

class Gigasecond {

    private static final Duration gigasecond = Duration.ofSeconds(1_000_000_000);
    LocalDateTime gigasecondDateTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        gigasecondDateTime = moment.plus(gigasecond);
    }

    LocalDateTime getDateTime() {
        return gigasecondDateTime;
    }

}
