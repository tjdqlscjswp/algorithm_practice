Jan 22 2024

Algorithm practice.

I can see often 'Reassigned local variable' warning in intellij. 
This warning is issued when I declare a local variable and then assign a new value to it later in the same scope. 
While it might not always be an error, it can lead to code that is harder to understand and maintain.
Here are a few reasons why I might want to address this warning.

1. Readability : Reassigning a variable in the same scope can make the code less readable. It may be unclear at first glance which value the variable holds at any given point.
2. Debugging : If you have to debug your code, reassigning variables can make it more challenging to track the flow of values through your program.
3. Potential Bugs : Reassigning variables might introduce subtle bugs, especially if the variable is used in conditions or loops.

At first, my code was like :

String result = ">";

if (num1 == num2) {
    result = "==";
} else if (num1 < num2) {
    result = "<";

return result;

In this case, local variable result is reassigned and might cause those problems above. So I fix the code like :

String result;

if (num1 == num2) {
    result = "==";
} else if (num1 < num2) {
    result = "<";
} else {
    result = ">";
}

Or String result1 = (num1>num2) ? ">" : ((num1<num2)?"<":"=="); with ternary operator.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Jan 23 2024

Today I solved simple conditional statement problem which is distinguish whether the given number of the year is leap year or not.





