<B>Java Basics</B>:<br/>
I.	What is java?<br/>
II.	Why java is important to learn for Selenium?<br/>
III.	What is Eclipse?<br/>
IV.	First Program in Eclipse<br/>
V.	Data type is Java<br/>
VI.	What is System.Out.Println and System.out.print?<br/>
VI.	String Concatenation<br/>

1.	What is java? <br/>
High level language based on OOPS<br/>
Open source programming language and available free to use no license cost required<br/>
OS independent means program will run on any OS<br/>

2.	Why java is important to learn for Selenium?<br/>
Selenium is based on Java is very strong combination as of now Java+Selenium is most widely used platform for automation. But to work with Selenium we must understand how to write java programs because selenium also has few libraries that will be used in Java.

3.	What is Eclipse?<br/>
Eclipse is the application that is used for writing java programs. It provides functionality to use java and selenium libraries with ease. It is IDE (Integrated Development Environment)

4.	First Program in Eclipse<br/>
<b>File->New->Project->Project Name->Finish</b><br/>
Project Name should be camel case to follow Naming convention<br/>
Under project use SRC folder to create packages and programs<br/>
JRE will automatically part of the project Eclipse will automatically will add it to projects<br/>
<b>Now right click – SRC-> New-> Java Package->Package Name </b><br/>
Eclipse will treat it as folder to create further new java programs. Packages enables us to manage our programs more standard and managed way<br/>
<b>Now right click – Package->New-Java Class-> Class Name</b><br/>
Naming Convention should be followed for classes as well. Because the name given in class name will create same name class program in the program. Make sure the click on check “public static void main (String[] args)” option in dialog. Make sure main function should be available in the program otherwise java will not be able to execute the program. Class name will be identified by the keyword class in the program. Important Parts of program:<br />
<br />•	Package
<br />•	Access Modifiers – Public, Private, Protected
<br />•	Keywords – class, static and void
<br />•	Comments – using // an /*. */
<br />•	Same variable can’t be used. Variable name should be unique based on the scope of the variable
<br />•	Datatype must be declared while creating variable
<br />•	Every statement should be ended with semi column
<br />
5.	Data type is Java
<br />a.	boolean data type
<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i.	boolean b1 = true;
<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ii.	boolean b2 = false;
<br />b.	byte data type
<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i.	byte a = 10;
<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ii.	byte b = -20;
<br />c.	char data type
<br />d.	short data type
<br />e.	int data type
<br />f.	long data type
<br />g.	float data type
<br />h.	double data type
<br/>
Boolean Data Type
The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions.
<br />The Boolean data type specifies one bit of information, but its "size" can't be defined precisely.<br /><br />
Example: Boolean one = false<br /><br />
Byte Data Type
The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.
<br />The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.
<br />Example: byte a = 10, byte b = -20<br /><br />
Short Data Type
The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
<br />The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.
<br />Example: short s = 10000, short r = -5000<br /><br />
Int Data Type
The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.
<br />The int data type is generally used as a default data type for integral values unless if there is no problem about memory.
<br />Example: int a = 100000, int b = -200000<br /><br />
Long Data Type
The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. Its default value is 0. The long data type is used when you need a range of values more than those provided by int.
<br />Example: long a = 100000L, long b = -200000L<br /><br />
Float Data Type
The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
<br />Example: float f1 = 234.5f<br /><br />
Double Data Type
The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float. The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.
<br />Example: double d1 = 12.3<br /><br />
Char Data Type
The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).The char data type is used to store characters.
<br />Example: char letterA = 'A'<br /><br />
6.	What is System.Out.Println and System.out.print?<br />
<br />a.	System.Out.Println – This will print in next line 
<br />b.	System.out.print – this will print in same line
<br />c.	Short cut is syso->Press Ctrl+space
<br />d.	Golden Rule - System.Out.Println and System.out.print will only be used only after the declaration of the variables
<br />
7.	String Concatenation
Program always being read from left to right meaning complier first check what is in left then check operator and then right and work accordingly.
Concatenation will always use + operator so it will work for integers very well but if we use strings in somewhere within integers then it will not add them because entire set will be considered as string and will have a string as result
We can also use text message in the Concatenation as System.out.println(“message” a +b);
