package com.kh.git;

import com.kh.git.animal.Cat;
import com.kh.git.animal.Dog;
import com.kh.git.animal.Snake;

public class Hellogit {
	public static void main(String[] args) {
		System.out.println("hello git");
		
		// dog 기능
		Dog dog = new Dog();
		dog.bark();
		
		//cat
		Cat cat = new Cat();
		cat.miao();
		
		// 뱀
		Snake snake = new Snake();
		snake.sound();
	}
}
