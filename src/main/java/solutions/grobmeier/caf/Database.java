package solutions.grobmeier.caf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Database {

	private static final Type PERSON_TYPE = 
			new TypeToken<List<Person>>() {}.getType();
	
	public List<Person> readAll() {		
		Gson gson = new Gson();
		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader("persons.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Person> data = gson.fromJson(reader, PERSON_TYPE);
		return data;
	}
	
	public void insertPerson(Person person) {
		// TODO insert a person to the json file (bonus)
	}
	
}
