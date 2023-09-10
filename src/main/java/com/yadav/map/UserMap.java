package com.yadav.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.yadav.model.User;
import com.yadav.model.UserDTO;

public class UserMap {

	public static void main(String[] args) {
		List<User> userList=new ArrayList<User>();
		userList.add(new User(101,"Sudharshan","Sudha@123","sudha@gmail.com"));
		userList.add(new User(102,"Sharada","Sharada@123","sharada@gmail.com"));
		userList.add(new User(103,"Subbaiah","Subbu@123","subbu@gmail.com"));
		userList.add(new User(104,"Harsha","Harsha@123","harsha@gmail.com"));
		
		Stream<UserDTO> streamMap = userList.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
			}
		});
		streamMap.forEach(u->System.out.println(u));
		userList.stream().filter(new Predicate<User>() {

			@Override
			public boolean test(User user) {
				return user.getUserName().startsWith("H");
			}
		}).forEach(u->System.out.println(u));
	}
}
