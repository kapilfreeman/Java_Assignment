package Hashmap;

import java.util.HashMap;
import CSVReader;
import exceptions.CsvException;
public class ParseStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "students.";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }

	}

}
