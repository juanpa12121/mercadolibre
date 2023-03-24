package co.com.tcs.certification.mercadolibre.utils;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class CSVUtilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSVUtilities.class);

    public static List<String[]> readCSV(List<String[]> strings) {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/test/resources/files/subcategorias.csv"))
                .withCSVParser(csvParser)
                .build()) {
            strings = reader.readAll();
        } catch (IOException | CsvException e) {
            LOGGER.error("Error al leer csv", e);
        }
        return strings;
    }

    public static List<String> getListSubcategories() {
        List<String[]> strings = new ArrayList<>();
        List<String> listSubcategories = new ArrayList<>();
        strings = CSVUtilities.readCSV(strings);
        for (int i = 1; i < strings.size(); i++) {
            String[] dataCustomerFromCSV = strings.get(i);
            listSubcategories.add(dataCustomerFromCSV[0]);
        }
        return listSubcategories;
    }
}
