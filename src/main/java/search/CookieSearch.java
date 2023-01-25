package search;

import parser.CommandLineInput;
import parser.LogBean;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static parser.LogCSVParser.parseLogCSV;

public class CookieSearch {

    public static void findMostActiveCookies(CommandLineInput input) throws FileNotFoundException {

        List<LogBean> cookiesLogList = parseLogCSV(input.getFileName());

        List<String> cookiesAtDate = cookiesLogList.stream()
                .filter(x -> x.getTimestamp().toLocalDate().isEqual(input.getDate()))
                .map(LogBean::getCookieID)
                .toList();

        Map<String, Long> groupCookiesByOccurrences = cookiesAtDate.stream().collect(groupingBy(x -> x, counting()));

        OptionalLong highestFrequency = groupCookiesByOccurrences.values().stream().mapToLong(count -> count).max();

        printOutMostActive(groupCookiesByOccurrences, highestFrequency.getAsLong());
    }

    private static void printOutMostActive(Map<String, Long> cookiesToOccurrences, Long highestFreq) {
        cookiesToOccurrences.entrySet().stream().filter(x -> x.getValue().equals(highestFreq)).map(Map.Entry::getKey).forEach(System.out::println);
    }

}
