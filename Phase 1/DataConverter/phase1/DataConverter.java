package phase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.Gson;
 
public class DataConverter {

    private static Address newAddress(String addrField) {
        String[] addrLines = addrField.split(",");
        if (addrLines.length != 5) {
            System.err.println("Address Field must have 5 fields separated by , " + addrField);
            System.exit(0);
        }
        Address addr = new Address(addrLines[0], addrLines[1], addrLines[2], addrLines[3], addrLines[4]);
        return addr;
    }

    public static void main(String args[]){
        BufferedReader br = null;
        BufferedWriter bw = null;
        String inputFile = "";
        String outputFile = "";
        String strLine = "";
        int recordCount = 0;
        Gson gson = new Gson();
        try {
            // Process Persons
            inputFile = "data/Persons.dat";
            br = new BufferedReader( new FileReader(inputFile));
            // Read first line first
            strLine = br.readLine();
            if (strLine != null) {
                try {
                    recordCount = Integer.parseInt(strLine);
                    if (recordCount < 0) {
                        System.err.println("Record Count must be a positive number");
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid Record Count in first line");
                    System.exit(0);
                }
            }
            // Use hashmap because we need to randomly access person by code for customer later
            Map<String, Person> persons = new HashMap<String, Person>();
            // Read rest of lines
            while( (strLine = br.readLine()) != null){
                String[] fields = strLine.split(";");
                if (fields.length != 4) {
                    System.err.println("Person record must have 4 fields separated by ; " + strLine);
                    System.exit(0);
                }
                // Address
                Address addr = newAddress(fields[2]);
                // Name
                String[] names = fields[1].split(",");
                if (names.length != 2) {
                    System.err.println("Person name must have 2 fields separated by , " + fields[1]);
                    System.exit(0);
                }
                // Instanstiate a Person
                Person person = new Person(fields[0], names[0], names[1], addr, fields[3]);
                persons.put(fields[0], person);
            }
            if (recordCount != persons.size()) {
                System.err.println("Persons record count " + recordCount + " is not same as found in file " +
                    persons.size());
                System.exit(0);
            }
            // Output Persons
            outputFile = "data/Persons.json";
            bw = new BufferedWriter( new FileWriter(outputFile));
            try {
                for(String key : persons.keySet()) {
                    Person psn = persons.get(key);
                    // System.out.println("Person: " + gson.toJson(psn));
                    bw.write(gson.toJson(psn) + "\n");
                }
            } catch (IOException e) {
                System.err.println("Unable to write to file: " + outputFile);
            } finally {
                // Close input file if already open
                try {
                    if (bw!=null) bw.close();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: " + inputFile);
        } catch (IOException e) {
            System.err.println("Unable to read the file: " + inputFile);
        } finally {
            // Close input file if already open
            try {
                if (br!=null) br.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
