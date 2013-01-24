package pl.lkedron.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	private static DataBase db;
	
	Map<String,User> users;
	
	private DataBase() {
		generateStartData();
	}
	
	private void generateStartData() {
		users = new HashMap<String, User>();
		users.put("User1", new User((long)0, "User1", 151, 100, "shaman", "chief"));
		users.put("User2",new User((long)0, "User2", 152, 150, "priest", "officier"));
		users.put("User3",new User((long)0, "User3", 0, 25, "warrior", "member"));
		users.put("User4",new User((long)0, "User4", 53, 80, "rogue", "nub"));
		users.put("User5",new User((long)0, "User5", 65, 122, "warrior", "guildtank"));
	}

	public static DataBase getInstance() {
		if (db == null){
			db = new DataBase();
		}
		return db;
	}
	
	public User getUser(String username) {
		try {
			return users.get(username);
		} catch (Exception ex) {
			return null;
		}
	}
	
	public List<User> getUsers(){
		List<User> us = new ArrayList<User>();
		for (User value : users.values()){
			us.add(value);
		}
		return us;	
	}
	
	public void addUser(User user) throws NullPointerException {
		if (user == null) {
			throw new NullPointerException("Nie podano usera");
		}
		users.put(user.getUsername(), user);	
	}
	
	public <K> void addRaid(List<K> raiders, int pts) {
		for (K raider : raiders) {
			users.get((String)raider).addPoints(pts);
		}
	}
	
	public boolean removeUser(String name) {
		return users.remove(name) != null;

	}
	
	public void addPoints(String raider, int pts, int ilevel){
		try {
			System.out.println(users.get(raider).getPoints());
			User user = users.get(raider);
			user.addPoints(pts);
			user.setItemLevel(ilevel);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
