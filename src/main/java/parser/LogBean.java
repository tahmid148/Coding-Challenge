package parser;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.time.LocalDateTime;

public class LogBean {
    @CsvBindByPosition(position = 0)
    private String cookieID;

    @CsvBindByPosition(position = 1)
    @CsvDate(value = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private LocalDateTime timestamp;

    public String getCookieID() {
        return cookieID;
    }

    public void setCookieID(String cookieID) {
        this.cookieID = cookieID;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
