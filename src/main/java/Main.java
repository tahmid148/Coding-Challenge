import parser.CommandLineInput;
import parser.LogBean;
import parser.LogCSVParser;
import picocli.CommandLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;

@CommandLine.Command (
        name = "Main",
        description = "This will serve as the entry point of the application"
)

public class Main implements Runnable {

    @CommandLine.Option(names = "-f", description = "Specify the filename to process")
    String filename;

    @CommandLine.Option(names = "-d", description = "Specify a desired date")
    String date;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        CommandLineInput commandLineInput = new CommandLineInput(new File(filename), LocalDate.parse(date));


    }
}
