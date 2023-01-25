package parser;

import java.time.LocalDateTime;

public class Log {
    private String cookieID;
    private LocalDateTime timestamp;

    public Log(String cookieID, LocalDateTime timestamp) {
        this.cookieID = cookieID;
        this.timestamp = timestamp;
    }

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
