# Fundamentals 2

## What we are covering in this session?

### 1. GitHub and git extended 
### 2. Coding Standards

---

When cloning the repo, you can use SSH but you have to generate keys. SSH is going via a more lower way of doing things

## Github

#### Cloning the repo:

	- "git clone <url>" will clone what is in the url it to that specific directory you are in
	- If opening in intellij you would want to create a gitignore file for the .idea folder then add it to the staging area and commit. 
	- For commit, it is good practice to put the file name at the end of the commit e.g: "git commit -m "Added inital .gitignore" .gitignore" 
	- Every time you make a commit, you see a new message in "git status" which tells you that you need to push the changes in the commit. The message is: 

On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

	- To share the changes in the repository, you need to use "git push" which will prompt you to put in your username and password
	
	- Basically the commit will save it locally, but to share it to the repository, you need to push the changes 

	- "mkdir <foldername> <foldername> …" means you can create multiple folders at once

	- To add all the new folders to staging area at once: "git add ." OR "git add fun*" which will add anything starting with fun

### Branches 

	- If I want to know all the branches out there, we use "git fetch" which will fetch all the branches
	- "git branch" will tell you what current branch you are on
	- "q" exits from that window

	- "git checkout <branch name>" will change branches to that branch manually

	- The new files within the new branch will no be grabbed to your local. To do that you use: "git pull" 

	- "git branch -a" will give you a better look at your branches, and the * shows you which one you're in

### Merging from one branch to another

	- First switch to the branch that you want to go to with "git checkout master"
	- Then "git merge <branch name>" will bring that branch back into the master branch
	- Then we need to push the changes since we are working in local with the command:
	"git push"

Head is the pointer of where you are up to with every other feature. So if you wanted to merge your branch back to the master but the master has changed and moved on then you need to update your branch to be the same as the master then commit the changes so that there are no conflicts

Good practice: When you do a branch you should bring the latest changes into the branch so that you can see all of your changes work with the master branch

Aliases, short hard commands


## Java

Object orientated Programming (OOP)

When we create a java file it also creates a .class file which is read by the computer

	- We need a .gitignore file for the .iml files
	
	To create a new java file we first need a package. It is in reverse area e.g. com.manchesterDigital
	
Keywords are colour coded. You cannot use them.

Curley braces are closures of your class

### Comments

	- // indicates an single line annotation
	- /* */ indicates a multiline annotation

	- /** will be the description that gets shown up when you hover over that class. It is more of documenting the class. 
	- To add an author to the file 

Java doc. Will help out someone else reading your code. It will explain every method etc in that class. It lets people know more about each method. It is good practice to create one.
	
     Method signature: describes what the method is made up of etc.

	- "psvm" will create your main method for you

	- "System.out.println()" will print what is in the closure to the console

	- "sout" will create your println for you 
 
	- 

### Variables

A place that holds data
Variable can be different sizes depending on the data type

When you define a variable, you define them on 2 things
In java, the left side is the datatype and the right will be the variable name.

2 different types of java datatypes
	- Primitive: pre defined by java, e.g. array, int
	- Non primitive: class level data types e.g. a class


## Data types:

### Primitive Data Types

Should not start your variable with a capital letter. Variables should be camel cases

	- Int: Integer, a number. E.g. int number; is declaring a variable of type int. Largest size ~2,000,000. It is a 32 bit integral value
	
		○ Can declare multiple variables of the same data types: int i1, i2, i3;
		Doing this: int i1, i2, i3 = 3; will only assign 3 to i3 the others will be set automatically to nothing, so you cannot use them without initialising them.
		
		Cannot declare 2 different data types on the same line
		
		Can put _ in numbers so that it is easier to read. E.g. "int miles = 1_000_000"
		
		○ Bad practice: do not declare multiple variables at the same time just to save lines
		
		○ Primitive types cannot be set to null in java so int cannot be set to null.
	
		○ Naming conventions for variables should describe the variable

	- Long: a large integer. 64-bit two's complement integer. E.g. long diameterOfSunInMiles=12L; the L tells the compiler that it is a long.

	- Short: a smaller integer: 16 bit signed twos compliment number.

	- Boolean: true or false, default value is false. 

	- Float: A decimal number. E.g. float pi = 3.14f; it has to have the "f" at the end. 4 bytes

	- Double: A decimal number. E.g. double percentage = 49.5; it does not need "d" but you can use it. It just explicitly makes it a double. 8 byte

	- Char: just one character. It can only be defined with single quotes. E.g. "char initial = 'A';"

Casting is you forcefully telling the complier you have to change the data type of that variable to something else. Implicitly.

### None Primitive Data Types

Primitive is given out of the box
Non primitive are custom made 

	- String: number of characters in the string are the number of bytes since it is made up of an array of chars which all are 1 byte. But it also depends on the number of bytes in the character since they aren't all the same size
		○ Bad practice to concatenate stings with the + symbol. It is also bad to use strings without assigning them since they are assigned to random parts in memory that you cannot delete. E.g. System.out.println(firstname+""+lastname);
		○ You can do it all in one with: "System.out.printf("Name:%2%2",firstname,lastname);"
		○ Better practice: Can also do "String.format("Name:%2%2",firstname,lastname);" you can use .format method in string 

	- StringBuilder: to create this variable you need to make a new instance of string builder
		○ StringBuilder output = new StringBuilder(); 
		○ "new" keyword creates a new instance of that class of type StringBuilder
		○ .append() can take anything as a parameter. Append will add it to the stringBuilder variable
		○ Builder pattern is that you can keep on appending on top of each other. E.g:
		output.append(firstname).append("").append(lastname);
			§ You can put them under each other too.
		○ Output.toString(); to put them together
		○ Best practice is using StringBuilder when using strings

	- Array:  holds multiple elements of the same datatype
		○ When declaring an array, you need to set the size: e.g.
		
		int[] numbers = new int[10];
		
		○ Creates an array of integers of size 10
		
		
	

	


		○ To assign the array at index 0: numbers[0] = 99;
		○ If you were to print the array, it will print the memory location not the array
		○ To print the array, use: Array.toString(numbers);
		○ This will print out [99,0,0,0,0,0,0,0,0,0] and wastes 9 spaces of memory
	
		○ Can declare the array like this: int[] lotteryNumbers = { 23, 16, 60 };
	
		○ Cannot access any index out of range
		
		○ Cannot set any values to positions that do not exist. It only has the sizes that were set when initialised.


	- Date: is the current date. E.g. Date today = new Date(); however it is not safe to use

When using non primitive Datatype you can use the key word 'new'

To make a method deprecated:

/**
*
*This is a hello method
*
*@deprecated becauseitisrubbish. Use {@link CodingStandard}
*/
@Deprecated
Private static void hello(){
	System.out.println("hello");
}


	- Along with int DataType, there is an Integer class. It is a safer option to use since it can be set to null. If you came in with a number which is null and assigned it to an int it wont like it but you can assign it to a variable with datatype Integer and it will allow this to be set. So then you can check if it is null etc.
	- There are wrapper classes for most primitive datatypes

Constants can be shown in wrapper classes. E.g. Integer.MAX_VALUE will return the max value of an integer.





Autoboxing: Can give it a value which is sensible to that Datatype. E.g. Integer will allow an int or null.
