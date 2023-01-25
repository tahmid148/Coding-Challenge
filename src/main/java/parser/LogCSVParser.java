package parser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.util.List;

public class LogCSVParser {

    public static List<LogBean> parseLogCSV(File file) throws FileNotFoundException {

        Reader reader = new BufferedReader(new FileReader(file));

        CsvToBean<LogBean> csvReader = new CsvToBeanBuilder<LogBean>(reader)
                .withType(LogBean.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();

        return csvReader.parse();
    }



}
