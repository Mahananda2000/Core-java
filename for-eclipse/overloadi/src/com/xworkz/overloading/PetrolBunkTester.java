package com.xworkz.overloading;

public class PetrolBunkTester {

	public static void main(String[] args) {
		/* String workersName[]= {"maha","sneha","laxmi","swati"};
		PetrolBunk bunk = new PetrolBunk(123,"DeveGouwda PetrolBunk","banashankari 2nd stage",workersName);
		System.out.println(bunk.id +" "+ bunk.name+ " "+ bunk.location + " "+workersName);*/
		
		
		String workersName[]= {"maha","sneha","laxmi","swati"};
		PetrolBunk bunk2=new PetrolBunk(workersName);
		//System.out.println(bunk2.id + " "+ bunk2.name);instead this used by below statement
		bunk2.displayDetails();

	}

}
//two types of overloading
//1)method overloading :i)instance,ii)static 2)constructor overloading-in a class 2 or 3 constrour same name but different parameterlist
//this() method is always initialized im\n the first statement of the parameter constructor.
//this method is used to achive the two constructor of a constructor it is only inside a constructor,chaining.
//this keyword is inside the class,method,block,constructor
//this method is achiev constrctor chain .
//once we can delete the java file of this() method in the output we can change loike default construcor is not displayed
//constructor,types of constructor ,use of constructor-to initialize the instanc variables,constructor overloading,constructor chaining-this()