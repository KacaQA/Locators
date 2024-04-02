public class CoreJavaBrushUp3 {
    public static void main(String[] args) {

        // String is an object that represents sequence of characters // String literal -
        // if we have same multiple values, then one object is created and value will refer to that one object, but if the value is different,
        // then more objects are created
        //String s = "Tennis Academy Spain";
        String s1 = "Tennis Academy Spain";
        String s5 = "Ball";

        // New keyword, using new memory alocate operater, always creates new object
        String s2 = new String("Welcome");


        String s = "Tennis Academy Spain";
        String[] splittedString = s.split("Academy");
        System.out.println(splittedString[0]);
        //System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
       // System.out.println(splittedString[2]);

        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }

        System.out.println("********REVERSE********");

        for (int i = s.length() - 1; i >= 0; i--)
        {
            System.out.println(s.charAt(i));
        }


    }
}
