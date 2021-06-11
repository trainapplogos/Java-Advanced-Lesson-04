package ua.lviv.trainapplogos;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	private List<UserAccount> listOfUsers = new ArrayList<>();
	private static UserService userService;
	
	private UserService() {
	}
	
	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserService();
		}
		
		return userService;
	}
	
	public List<UserAccount> getListOfUsers() {
		return listOfUsers;
	}
	
	public void saveUser(UserAccount user) {
		listOfUsers.add(user);
	}
	
	public UserAccount getUser(String email) {
		return listOfUsers.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
	}
}
