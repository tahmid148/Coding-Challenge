package search;

import parser.CommandLineInput;
import parser.LogBean;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static parser.LogCSVParser.parseLogCSV;

public class CookieSearch {

    public static void findMostActiveCookies(CommandLineInput input) throws FileNotFoundException {

        List<LogBean> cookiesLogList = parseLogCSV(input.getFileName());

        List<String> cookiesAtDate = cookiesLogList.stream()
                .filter(x -> x.getTimestamp().toLocalDate().isEqual(input.getDate()))
                .map(LogBean::getCookieID)
                .toList();


    }

}
