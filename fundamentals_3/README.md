An assignment statement:
When you assign something to a variable or something
E.g. int numberOfTeams = 4;

- Statements have to finish in ';' which indicates an end of a statement

Method invocation statement:
E.g. System.out.println("HelloWorld");

- Object creation statement:
- E.g. Car audi = new Car();

- Declarative statement. Declared but not assigned
- E.g. double interest Rate;

- Expression Statement
When you call multiple methods or variables together to produce something else.
E.g. amountOfInterest = interestRate * years;

When ever you are writing an expression e.g. Math.PI * radius * radius
You can add '.var' to the end to assign a variable to it.


Control + J gives you the signature of method
Command + N will allow you to generate certain methods


- 3 Types of variables
  ○ Local: can only be used within the scope of where it is declared, and its child classes/methods

  ○ Instance: Variable that is initialised on creation of the class with a constructor

  ○ Class: variable declared within the scope of the class level, meaning it can be used within that class, its methods and the sub classes.

  If you want to access a class variable within a static method, you need to make the variable static too. However if you have static variable it will only be stored once no matter how many times you create the class so it can be dangerous.

  Constructor: Allows you to create a new object

  Private Keyword: makes variables not able to be accessed outside of the class. Only internally within the class

  Deadlock: - things are running in multiple threads (area of space in compiler where code is run from) so 2 things could be calling the same variable from different threads and so breaks

- Constant:
Variable that cannot change its value.
Declared with keyword - final
Constant name should be capitalised and have _ to split words. E.g.

Public static final String CLASS_NAME = "Bootcamp";

Normally declared at the top of the class

To access this static constant in another class. We can just call:
Student.CLASS_NAME;
However, you can also do a static import: com.manchesterDigital.Student.CLASS_NAME;
Which will allow you to just call: CLASS_NAME; without referencing the class

Italic variable lets you know it is static

- Operators:
  ○ Addition:
  Int result = 1+2;
  Addition in this context. However '+' will be used as a concatenator in other contexts. E.g. System.out.println("The value is " + result)

  ○ Subtraction:
  result = 3-1;

  ○ Multiplication:
  result = 5 * 9;
  result *= 5; //multiples result by 5

  ○ Division:
  result = 10 / 5;
  result /= 5; //divides result by 5

  ○ Modulus:
  Will return the remainder after dividing
  result = 20 % 10; // will return 0

  ○ Increment:
  result = result + 1;
  result += 1;
  result++; // Post-increment, because '+' symbol is after the variable
  ++result; //Pre-increment

  ○ Decrement:
  result = result - 1;
  result -= 1;
  result--; //post-decrement
  --result; //pre-decrement


  ○ '!' NOT operator
  Will do the opposite of the expression. E.g.
  If (!isRainingToday) {
    System.out.println("You will need a jacket!");
  }


  ○ Equality of value: '=='
  Will return true if the value equals the other value. E.g.
  If (number1 == number2){
  }

  ○ Not equal to: '!='
  Will return true if value is not equal to another value. E.g.
  If (number1 != number2) {
  }

  ○ Less than '<'
  Will return true if value is less than the other value/ E.g.
  If (number1 < number2) {
  }

  ○ Greater than '>'
  Will return true if value is more than the other value/ E.g.
  If (number1 > number2) {
  }

  ○ '>=' or '<='
  Greater than or equal to, or, less than or equal to

  ○ AND operator '&&'
  Returns true if all things in expression are true
  If (degreeScore >= 60 && overallScore >= 100) {
  }

  ○ OR operator '||'
  Returns true if one or the other is true
  If (degreeScore >= 60 || overallScore >= 100) {
  }


  ○ Cannot do assignments within expressions:  e.g.

  If (number1 = 1) {
  }

  Apart from with boolean since an expression will evaluate true or false, and boolean can only be true or false. E.g.

  If (isAnimal = true){ //this will work
  }

  ○ With non primitive dataTypes, for example String, you use '.equals()' instead of '==' operator. E.g.

  If(lastName.equals("Sousa")) {
  }

  ○ String '.equalsIgnoreCase("")' // doesn’t matter about uppercase or lowercase

  If(lastName.equalsIgnoreCase("SOUSA")) {
  }


  ○ Ternary Operator '?'
  Another way of
  Takes an expression and allows you to do something if it is true, or false. E.g.

  Boolean isHungry = numberOfMealsToday == 1 ? true : false;

  Basically says, if numberOfMealsToday == 1, if its true, return true, if it is false, return false.


- If statements:
can use if statements without curly braces but its bad practice. It will only run the line after it if it is indented

If a condition is met then do something. What ever is within the scope of the if statement will be run

Else: if the condition is not met then do what is in the curly braces

Else if: another if statement after the first if, it is another condition.

E.g.

If(age <= 19) {

}else if (age > 20 ) {

}else{

}

Avoid doing multiple 'else if' statements
Avoid nested 'if', or 'else if'



- Switch statements:
Used when it is non conditional

E.g.

Int coinInserted = 50;

switch(coinInserted){
  case10:
    System.out.println("Inserted 10p");
    break;//do not go any further than that line, come out of that switch statement
  case20:
    System.out.println("Inserted 20p");
    break;
  case50:
    System.out.println("Inserted 50p");
    break;
  case100:
    System.out.println("Inserted £1");
    break;
  default://best practice to put a default in
    System.out.println("Inserted an invalid coin");
    //don’t need break for default

}

If some outcomes are the same, you can put them together like so:

switch(coinInserted){
  case10:
  case20:
    warningMessage();
    break;
  case50:
    System.out.println("Inserted 50p");
    break;
  case100:
    System.out.println("Inserted £1");
    break;
  default:
    System.out.println("Inserted an invalid coin");
    //don’t need break for default

}
