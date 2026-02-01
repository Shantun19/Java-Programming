/*

Rules for defining the java identifier 

1.the only allowed character in java identifier are , 
    a-z , A-Z , 0-9 , $ , _ 
    if we are using any other character we will get the compile time error.
    identifier can't start with the number/digits.

    example :
        total_number - correct
        total#number - incorrect 
        123Total - incorrect
    
2.java identifier are case-sensitive java itself a case-sensitive programming language.

    example :
        int num = 10;
        int Num = 20;
        int nUm = 10; 

        all the above example are treated different in java.

3.there is no length limit for the java identifier.
    example :
        int xxxxxxxxxxxxxxxxxxx........100 = 10; - correct 
    but it is not consider as a good practise to declare the varaible name like this.

4.we can't use the reserved keyword as identifier in java.
    example : 
    int if = 89; - incorrect in java 
    
5. all the predefined java classes and interface we can use as identifers
    int String = 10;
    int Runnable = 10;
    
    because String and Runnable are not the keyword they are class Name and java only restrict to use the keywords like if , else , switch ..
    Java allows variable names to be the same as class or interface names.
    
    Java keywords cannot be used as variable names:
    
    int class = 5;- compile-time error
*/
