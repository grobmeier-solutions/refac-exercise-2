package solutions.grobmeier.caf;

import java.util.Collection;
import java.util.List;

/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        Database database = databaseConnector.getDatabase();
        List<Person> persons = database.readAll();
        
        for (Person person : persons) {
        		System.out.println(person.last_name);
		}
    }
    
    public void filterForLastName(List<Person> person, String lastName) {
    		// TODO: output all persons with last_name starting with
    }
    
    public void sortByEmailAddress(Collection<Person> person) {
		// TODO: output all persons sorted by email address
    }
}
