package parser;

import java.time.LocalDateTime;

public class LogBean {
    private String cookieID;
    private LocalDateTime timestamp;

    public LogBean(String cookieID, LocalDateTime timestamp) {
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
