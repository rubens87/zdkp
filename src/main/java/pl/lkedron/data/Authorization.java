package pl.lkedron.data;

public class Authorization {
	private String username = "admin";
	private String password = "pass";
	
	public boolean authorize(String username, String password)
	{
		if (this.username.equals(username) && this.password.equals(password))
		{
			return true;
		}
		return false;
	}
}
