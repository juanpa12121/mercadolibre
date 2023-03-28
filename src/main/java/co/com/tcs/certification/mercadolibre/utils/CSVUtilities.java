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
import java.util.Arrays;
import java.util.List;


public class CSVUtilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSVUtilities.class);

    public static List<String[]> readCSV(List<String[]> listVector) {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/test/resources/files/subcategorias.csv"))
                .withCSVParser(csvParser)
                .build()) {
            listVector = reader.readAll();
        } catch (IOException | CsvException e) {
            LOGGER.error(Constants.MESSAGE_ERROR_READ_CSV, e);
        }
        return listVector;
    }

    public static List<String> getListSubcategories(String nameCategory) {
        int indexCategory = 0;
        List<String[]> listVector = new ArrayList<>();
        List<String> listSubcategories = new ArrayList<>();
        listVector = CSVUtilities.readCSV(listVector);
        indexCategory = getIndexCategory(listVector.get(0), indexCategory, nameCategory);
        for (int i = 1; i < listVector.size(); i++) {
            String[] dataCustomerFromCSV = listVector.get(i);
            listSubcategories.add(dataCustomerFromCSV[indexCategory]);
        }
        listSubcategories.removeAll(Arrays.asList("", null));
        return listSubcategories;
    }

    //Metodo para retornar el indice de la categoria (columna) que necesitamos
    //Se buscara dentro de listVector.get(0) la categoria que se necesite
    //vector: Para buscar, int: Para retornarlo, String: Con el nombre de la categoria que le paso desde el feature
    public static int getIndexCategory(String[] vector, int indexCategory, String nameCategory) {
        indexCategory = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].equals(nameCategory)) {
                indexCategory = i;
                i = vector.length; //Para que deje de recorrer
            }
        }
        return indexCategory;
    }
}