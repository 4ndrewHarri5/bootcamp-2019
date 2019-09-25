Best practice to put the access modifier even if you do not need it

Wrapper class gives you autoboxing and allows you to set it to null. So it is preferred to use wrapper classes where you can


Can use Control + Space to auto fill in what the IDE thinks should be there

Cannot use static method on an instance of a class, only by using the class directly.

Exceptions: 
We can not guarantee what the user might type, or that what we have coded is correct. So we need to handle these exceptions.

E.g. 

Public void debitAccount(double amount) throws Exception {}


Throws exception tells the us that this method can potentially go wrong. It is like a pre warner

	Everything in java extends from Object. Everything bellow it is part of Object (at least)

	Exception tree: 
	
							Errors >
							
		Object > Throwable > 
										Other exception
							Exception(s) >
										Runtime exception
										E.g. array index out of bounds
										
	For example:
	
	
	Private static void printArray(int index, int[] arr){
		System.out.println("Element" + index + " is " + arr[index]);
	}
	
	
	If you called:
	
	printArray(3, {1,2,3}) -> it will return java.lang.ArrayIndexOutOfBoundsException:3
	
	Because it is trying to access index 3 in an array that only has index 2
	
	- Instead you can use a try {} catch {} block to catch the exception if there is one. E.g:
		 
		try{
			PrintArray(3, intArray);
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("element does not exist");
		}
	
	System.err.println(); will be an error instead of console informational message
	
	
	The exceptions are all in a stack. For example for IndexOutOfBoundsException:
	
	Object
		Throwable
			Exception
				RuntimeException
					IndexOutOfBoundsException
					
					
	When creating a method which uses a class that could throw an exception. You can throw that exception in your method too. For example
	
	Public static Long convertStringToLong(String input) {
		Return new Long(input);
	}
	
	This could potentially throw an exception since you could input not a number.
	
	So you can throw an exception like so: which basically tells the user of the method that it could potentially throw an exception.
	
	
	Public static Long convertStringToLong(String input) throws NumberFormatException {
		Return new Long(input);
	}
	
	And when calling it, you can use a try {} catch {} block to catch that NumberFormatException
	
	Best Practices:
			1. Do not state just throw 'Exception' since no one knows that type of exception it is
			
			2. Also its not best in the catch block to just catch 'Exception' it is best to catch the specific Exception.
			
			3. Do not catch the exception 'Throwable' it also absorbs the errors that you might want to receive
			
			4. Use a java doc to document your exceptions. 
			
			5. Don’t print out just the exception in the catch block. When you throw exceptions and catch them, be as descriptive as possible.
			
			6. Order of catch blocks matter. Always catch the most relevant or obvious exceptions first.
			
			7. Do not have a catch with nothing in it
		
			8. Do not have multiple try {} catch {} for the same task
		
			9. Do not re-throw the exception in the catch block: throw e;
		
			10. Do not print the exception and then throw the exception
		
			11. However, you can throw new IllegalArgumentException("Invalid input provided", e);
			And properly explain the exception
			
			12. You can also have a finally {} block. Allows you to close something, for example if you are talking to an input stream. You can close it after you’ve finished in the finally {} block.
		
		
		Creating own exceptions
	
		Abc
		
		
		
		Testing:
		
		- Needs to have good code coverage
		- Needs to be good quality
	
	
		Why do we do testing: 
		- To make sure the code runs as expected 
	
		Types:
	
		- Functional testing
			§ Manual testing
			§ Integration testing
				□ Developer writes tests to verify your code works with an integration of other code
				□ If you are relying on another library you would also use this
			§ Smoke testing 
				□ When testers receive your code and run their own tests
	
		- Non-functional testing
			§ Performance testing (perf tests)
				□ Where you are saying does the system perform and meet KPIs
					® QA will do this
				□ Load testing
					® Can the application handle millions of requests without losing performance?
			§ Stress testing
				□ Can your application work outside its boundaries?
					® Your program handles 100 requests but can it handle 200?
					® Can you replicate it?
				□ Is it scalable and future proof?
	
		- Unit testing (Matters to programmers)
			§ Writing a test just for one method, not for the whole class. 
			§ A unit is a single thing (SRP)
			§ Multiple unit tests ran in a bundle are called 'suite'
				□ Suites are there to allow you to group things
	
		Code coverage:
			Has every single line of my code been called? Directly or indirectly.
		
		TDD allows you to hit 100% code coverage 
			
	
		- AWS: allows us to do scalability
			§ It uses servers around the whole world, usually near the location where you are based
			§ The load is spread
	
	
	Testing:
	
		AAA - (Duracell AAA battery)
			- Arrange (tests)
			- Act (perform the action you want to perform
			- Assert (do an assertion on it)
					
		For an idea to go from someone's head into the computer, it must go through someone else's hands
		
		Build tools:
			MAVEN: 60%
			GRADLE: 40% (has a language behind it so more complicated)
			
		To create a new maven project:
		
		Create new project > maven > next > enter fields 
		
		GroupID -> same as package name. the company
		AtifactID -> name of project
		Version -> telling the outside world what version the code is SNAPSHOT means its in draft and not production code
		
		Numbering mechanism: increment by 1 whole number for big updates that are not backwards compatible or major changes. .1's for small changes. If new version not working, you can roll back to the previous version where it was working while you're fixing it.
		
		Next > Choose Directory for saving > Finish > maven project has been created
		
		Should open up pom.xml > 
		
		Here you can add your dependencies with: 
		<dependencies></dependencies> 
		
		Inside of that tag, add:
			
			<dependency>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
				<version>4.12</version>
				<scope>test</scope>/
			</dependency>
			
			Junit is a unit testing framework. Junit is basically a runner
			
			<dependency>
				<groupId>org.assertj</groupId>
				<artifactId>assertj-core</artifactId>
				<version>3.9.1</version>
				<scope>test</scope>
			</dependency>
			
			
			
		Scope is saying: when I build my jar, do not include this jar as something I rely on since it is only scope at the test level
			 
		
		Dependency/library is basically a .jar 
		
		and your properties with: 
		<properties></properties>. You need to add 
		
		<maven.compiler.target>1.8</maven.compiler.target>  // the end thing you produce which is a jar
		<maven.compiler.source>1.8</maven.compiler.source>  //code that you are making
		
		Code you generate has to stay at the same version
		
		
		Introduction to tests:
		
		Writing tests is no different to writing normal code
		
		Command + N to generate new Test Method, it creates an annotation which needs to be used throughout writing a java test
		
		@Test
		Public void testName(){
		}
		
		Tests run in parallel and in any given order. Don’t write a test that another test relies on
		
		
		Example test using AAA
		
		@Test
		Public void shouldAddTwoNumbers(){
			//Arrange
			Int first = 23;
			Int second = 23;
			
			//Act
			Int result = first + second;
			
			//Assert
			Assertions.assertThat(result).isEqualTo(46);
		}
		
		

		Test package and main package should match. Basically test and main should be a mirror.
		
		Writing code in a TDD way:
		
		
		
		
		Before writing the method, we write the test.
		
		
		First test is the hardest to write because you need to think where to start. Start with the most basic test and make it fail.
		
		
		
	
	
