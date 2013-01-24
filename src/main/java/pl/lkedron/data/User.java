package pl.lkedron.data;


public class User {

	private long id;
	private String username;
	private int itemLevel;
	private int points;
	private String position;
	private String clazz;
	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public User(Long id, String username, int itemLevel, int points, String clazz, String position)
	{
		this.id = id;
		this.username = username;
		this.itemLevel = itemLevel;
		this.points = points;
		this.setPosition(position);
		this.clazz = clazz;
	}
	
	public User(){
		
	}

	public int getPoints() { return points; }
	
	public void addPoints(int pts) {
		this.points=this.points; 
	}
	public void setPoints(int pts) {
		this.points = pts;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
