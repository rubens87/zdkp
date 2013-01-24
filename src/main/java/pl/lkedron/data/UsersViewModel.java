package pl.lkedron.data;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class UsersViewModel {
	private User selectedUser;
	private List<User> users;
	private User newUser = new User();
	
	public void init() {
		selectedUser = users.get(0);
	}
	
	public List<User> getUserList() {
		return users;
	}
	
	public List<User> getUsers(){
		if (users == null){
			users =  DataBase.getInstance().getUsers();
		}
		return users;
	}
	
	public void setSelectedUser(User choosen){
		this.selectedUser = choosen;
	}
	
	public User getSelectedUser(){
		return selectedUser;
	}
	@Command
	public void addUser(){
		
	}
	@Command @NotifyChange({"users"})
	public void fillUser(){
		getUsers().add(newUser);
	}
	@Command @NotifyChange({"selectedUser", "users"})
	public void removeUser(){
		getUsers().remove(selectedUser);
	}
	
	public User getNewUser(){
		return newUser;
	}
	
}
