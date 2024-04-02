public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

        int myNum = 5;
        String website = "Katarina";
        char letter = 'r';
        double dec1 = 5.99;
        float dec2 = 6.99f;
        boolean myCard = true;

        System.out.println(dec2+ " is the value stored in dec1");

        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 111};
        System.out.println(arr2[4]);

        // FOR loop
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println (arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i]);
        }

        String[] name = {"rahul", "shetty", "selenium"};
        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);
        }

        //Another ways FOR loop

        for (String s: name) {
            System.out.println(s);
        }







    }
}
