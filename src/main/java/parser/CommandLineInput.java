package parser;

import java.time.LocalDate;

public class CommandLineInput {
    private String fileName;
    private LocalDate date; // LocalDate is used to accommodate the date formatting style

    public CommandLineInput(String fileName, LocalDate date) {
        this.fileName = fileName;
        this.date = date;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
