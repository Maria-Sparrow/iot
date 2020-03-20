package ua.lviv.iot.chemicals.writer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.chemicals.BaseHouseholdChemicalsManagerTest;
import ua.lviv.iot.chemicals.model.AbstractHouseholdChemicals;


public class HouseholdChemicalsWriterTest extends BaseHouseholdChemicalsManagerTest {
    @Test
    public void testWriteToFile() throws IOException {
        try (Writer fileWriter = new FileWriter("Path.csv")) {
            HouseholdChemicalsWriter writer = new HouseholdChemicalsWriter();
            writer.setCsvWriter(fileWriter);
            writer.writeToFile(householdChemicals);
        }
    }

    @Test
    public void testUsingString() throws IOException {
        try (Writer csvWriter = new StringWriter()) {
            HouseholdChemicalsWriter writer = new HouseholdChemicalsWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(householdChemicals);
            String expectedString = "";
            for (AbstractHouseholdChemicals householdChemical : householdChemicals) {
                expectedString += householdChemical.getHeaders() + ", " + householdChemical.toCSV() + "\r\n";
            }
            assertEquals(expectedString, writer.toString());
        }
    }

}
