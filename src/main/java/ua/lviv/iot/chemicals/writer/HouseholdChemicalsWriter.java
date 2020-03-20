package ua.lviv.iot.chemicals.writer;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;

public class HouseholdChemicalsWriter {
    private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }

    public void writeToFile(List<AbstractHouseholdChemicals> householdChemicals) throws IOException {
        String textToWrite;
        for (AbstractHouseholdChemicals householdChemical : householdChemicals) {
            textToWrite = householdChemical.getHeaders() + ", " + householdChemical.toCSV() + "\r\n";
            csvWriter.write(textToWrite);
        }
    }

    public String toString() {
        return csvWriter.toString();
    }

}
