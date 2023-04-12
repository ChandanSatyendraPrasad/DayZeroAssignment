public class DayZeroAssignmentZeroFour {
    public static void main(String[] args) {
        int aa=981;//4 Size
        char srk='A';//1 Size
        System.out.println("CHAR = "+srk);
        int srk_val=srk;
        System.out.println("INT CHAR = "+srk_val); //Automatic Type Conversion
        double hp=aa*srk;//8 Size
        System.out.println("IDEA = " +hp);
        float airtel=(float) hp;//4 Size //Type Casting
        System.out.println("ZHOLL = "+airtel);

        int div =aa/srk*0;//BODMAS
        System.out.println("DIV = "+div);
        try
        {
            int dd=div/0;
        }catch (ArithmeticException arithmeticException)
        {
            System.out.println("Error = "+arithmeticException);
        }

        System.out.println(div);
    }
}
