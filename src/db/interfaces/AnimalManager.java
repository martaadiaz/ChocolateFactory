package db.interfaces;

import java.sql.Date;
import java.util.List;

import pojos.*;

public interface AnimalManager {
	public void connect();
	public void disconnect();
	public void createTables();
	
	public DogManager getDogManager();
	
	
}