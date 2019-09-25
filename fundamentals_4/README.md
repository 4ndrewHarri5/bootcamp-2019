Today

More if statements and control flow
Methods
Exception and Exception Handling


If logic: -> flow diagram

Use pseudo code if you do not grasp it

If returning static numbers/strings, you can create a constant of it and just return the constant. Or 

Code coverage: [WILL COME BACK TO IT]

false

True


	- Methods:
	Structure:
	<access modifier> <optional final> <return type> <method name>(<parameters>) <optional exception>
	
	E.g. 
	Function: Public final int milesToWalk(…) throws Exception does return a value of int
	
		- May or may not take an input
		- Throws: makes sure errors are caught
		- Exception is a class, what we do when we want to throw an exception
	
	Procedure: Public void int sayHello(String name) does not return value
	
	Access modifier -> ability to see or not see in java
		- Public: can be used outside of the class
		- Private: can only be used within the class
		- Protected: can be used provided that you are in the same level of package
	
	Optional Final -> 
	Mutation is a bad thing, you want it to be imutable
	We use the keyword final where you feel that your code should not be manipulated 
	
	Return type -> any datatype, primitive and non primitive
	
		- Should not go more than 5 arguments within the method, might be doing to much within the method
		- You cannot start a method with a number
		
		
	Call your method name your intention of what you're trying to do
	
	SRP
	Single Responsibility Principle
	Make sure method is called what it does, and does not do anything else
	
	Static allows you to access that method without creating a new instance of that class
	
	When using protected on a method, you can access the method from the instance of that class within the package. But you cannot access the protected method from the instance of the class outside of that package. Protected only allows you to see the method in the level that you are in
	
	
	Lookup: SOLID Principles
	
	What is a member variable (member is an instance variable)
	
	
	Method overloading:
	You cant have a method with the same signature, however you can have methods that are called the same but have different parameters
	
	How developers work:
	- Used to work in waterfall
	- Now use agile
	- The business analyst creates Stories which are smaller tasks within the project needed to be created
	- If deadline gets pushed back, they prioritise the tasks needed to be create. 
	- A story is a ticket, it is a the task you are to do
	- A sprint is a range for time to complete the story
	- Before picking up a story, you do 3 amigos

	- Bus factor: 
		- Should never have a bus factor of 1

	Method overloading is also used for backward compatibility. Do not remove something if its not being used within the class, because it might be being used else where, therefore just overload and create a new method with new parameters and use the @depricated keyword to show that the previous method is not being used
	
	
	- When creating a class and making a new instance of a class, even if the class doesn’t have a constructor, it does have one behind the scenes so you don’t need one, unless you have made one and then you need the standard constructor if you want an empty instance.
	
	- Getter: When you want to retrieve something
	- Setter: when you want to set a value

	Method Overriding:
	Use this method instead of the standard method. You are overriding the standard one. For example:
	
	.toString() in a class will return the memory location, however you can override .toString() like so:
	

	@Override
	Public String toString(){
		Return "Student{" + "name ='" + name + '\'' + ", age =" + age + '}';
	}
	
To do another thing instead of the standard toString() basically customising it to your preferences in the class.