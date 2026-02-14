/*

Byte Data type 
    - size = 1 byte = 8bits
    - Min value = -128
    - Max value = 127
    - Range = -128 to 127

1 bit represent 2 values = 2^n combination/values (n is the no. of bits)
now , it has 8 bits so the possible combination of values is 2^8 = 256 combination of values.
ex : 00000000 , 00000001 , 00000100 ....... etc 

byte is a signed data type means represent both positive and negavive values.
the byte data type uses 2's compliment means the most significant bit(MSB) will represent the sign of the values either it is +ve or a negative values.

calculation of MAX value
    - all bits conatains 1's except the MSB
    - 2^6 + 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0 = 127
    
calculation of MIN value
    - the MSB will contsins 1's except all 7 bits 
    - -2^7 = - 128

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        byte max = 127;
        byte min = -128;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
