package parser;

import java.io.File;
import java.time.LocalDate;

public class CommandLineInput {
    private File fileName;
    private LocalDate date; // LocalDate is used to accommodate the date formatting style

    public CommandLineInput(File fileName, LocalDate date) {
        this.fileName = fileName;
        this.date = date;
    }

    public File getFileName() {
        return fileName;
    }

    public void setFileName(File fileName) {
        this.fileName = fileName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
