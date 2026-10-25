class AllBitwiseOperator {
    public static void main(String[] args) {
        // IT WORK ONLY ON BINARY INTEGERS (0,1)

        int num1 = 5 ;
        int num2 = 1;

        // num1 =  0101 = 5
        // num2 =  0001 = 1
        // print num1 & num2 = 5 & 1
        // 0101 = 5
        // 0001 = 1
        // 0001 = 1 = result

        System.out.println(num1 & num2);
        /*
        USING BITWISE AND (&) OPERATOR
        11 = 1
        10 = 0
        01 = 0
        00 = 0
        SO, 0101 | 0001 = 0101
                          0001
                          0001 = 1
         */

        System.out.println(num1 | num2);

        // USING BITWISE OR (|) OPERATOR
        // 0101 = 5;
        // 0001 = 1 ;
        // 0101 | 0001 = 0101 = 5

        /*
        ~ (NOT OPERATOR ) = compliment reverse all bit 1 = 0 and 0 = 1;
        ^ (XOR OPERATOR) = IF 00 = 0 , 11 = 0 , 10 = 1 , 01 = 1;
        << ( LEFT SHIFT ) = IN LEFT SHIFT THE LSB FALL AND ADD A NEW BIT (ZERO(0)) ON MSB;
        >> (RIGHT SHIFT ) = IN RIGHT SHIFT THE MSB FALL AND A NEW BIT ADD ON LSB
        ( IF THE LSB IS ZERO (POSITIVE) THEN THE ZERO IS ADD AND IF THE LSB IS ONE (NEGATIVE) THEN ONE IS ADDED ON LSB )
         */

        System.out.println(~num1);

        // USING BITWISE NOT (~) OPERATOR
        // result = 0101 = 5 = 1010 = (-6) ??;

        System.out.println(num1 ^ num2);

        // USING BITWISE XOR (^) OPERATOR
        //0101 = 5;
        //0001 = 1;  0101 ^ 0001 = 0100 = 4

        System.out.println(num1 << 1);

        // USING BITWISE LEFT SHIFT (<<) OPERATOR
        // 0101 = 5;
        // 0101 << 1 = 1010 = 10;

        System.out.println(num1 >> 1);

        // USING BITWISE RIGHT SHIFT (>>) OPERATOR
        // 0101 = 5;
        // 0101 >> 1 = 0010 = 2;
    }
}
