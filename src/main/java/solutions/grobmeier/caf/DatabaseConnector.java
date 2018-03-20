package solutions.grobmeier.caf;

public class DatabaseConnector {
	// TODO refactor to make this a singleton
	public Database getDatabase() {
		return new Database();
	}
}
