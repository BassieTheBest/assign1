## CSCE 10204: Assignment One

### Problem One - Method to Convert a String to an Integer
             
Write the code to implement the **stringToInt() method**. This method should parse the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' to indicate a negative value or an ASCII plus sign '+' to indicate a positive value. The resulting integer value is returned.
```Java
public static int stringToInt(String str)
```
**Parameters:**

str - a String containing the int representation to be parsed

**Returns:** 

The integer value represented by the argument in decimal.

This method should perform the same as the **Integer.parseInt()** method in the Java library.  *For this problem, the only Java classes/methods that can be used are **String.length(), String.charAt(), and String.equals()**.  You cannot use any of the other classes or methods for this problem.*

---

### Problem Two - Method to Convert an Integer to a String
             
Write the code to implement the **intToString() method**. Returns a String object representing the specified integer. The argument is converted to signed decimal representation and returned as a string.
```Java
public static String intToString(int val)
```
**Parameters:**

val - an integer to be converted.

**Returns:** 

A String representing the signed integer value.

This method should perform the same as the **Integer.toString()** method in the Java library.  *For this problem, the only Java classes/methods that can be used are **String.length(), String.charAt(), and String.equals().**  You cannot use any of the other classes or methods for this problem.*

Test each of your methods with **different test cases(input)** using a driver program to verify the correctness of your methods. 
