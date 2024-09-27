package com.lms;

import java.util.Scanner;

class Dog extends Animal{
	  @Override
	    public void makeSound() {
	        System.out.println("The dog barks.");
	    }
	 
}

class Cat extends  Animal{
	  @Override
	    public void makeSound() {
	        System.out.println("The cat meows.");
	    }

}
public class Animal {
	 public void makeSound() {
	        System.out.println("The animal makes a sound.");
	    }
	 public static void main(String[] args) {
		   System.out.println("Choose an animal: 1. Dog 2. Cat");
		Scanner sc=new Scanner(System.in);
		Animal animal;
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			animal = new Dog();
			break;
		case 2:
			 animal= new Cat();
			break;
	    default :
	    	 animal = new Animal();
	   
		}
		animal.makeSound();
	}
}
