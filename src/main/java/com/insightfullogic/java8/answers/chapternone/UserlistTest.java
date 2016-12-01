package com.insightfullogic.java8.answers.chapternone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wangchangye on 2016/12/1.
 */
public class UserlistTest {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User(3,"金神3"));
		list.add(new User(1,"谨慎1"));
		list.add(new User(2,"谨慎2"));
		//list.sort(Comparator.comparing(User::getAge));
		//Collections.sort(list, Comparator.comparingInt(User::getAge));
		List<User> userList = list.parallelStream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
		System.out.println(userList);

	}

}
