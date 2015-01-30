class Test
{
    public static void main(String[] args)
    {
        testSum();
		testSub();
        testMul();
        testDiv();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testSub()
    {
        int a = 5;
        int b = 6;
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.sub(a, b);
        if (result == expected)
        {
            System.out.println("Sub: OK");
        }
        else
        {
            System.out.println("Sub: Failed, expected = " + expected + ", result = " + result);
        }
    }


    private static void testMul()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.mul(a, b);
        if (result == expected)
        {
            System.out.println("Sub: OK");
        }
        else
        {
            System.out.println("mul: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testDiv()
    {
        int a = 10;
        int b = 2;
        double expected = 5;
        BasicMath bm = new BasicMath();
        double result = bm.divide(a, b);
        if (result == expected)
        {
            System.out.println("devide: OK");
        }
        else
        {
            System.out.println("devide: Failed, expected = " + expected + ", result = " + result);
        }
    }

     
}
