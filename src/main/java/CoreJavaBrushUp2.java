import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 122};

        // get values divided by 2
        // 2, 4, 6, 8, 10, 122

        for (int i = 0; i < arr2.length; i++)
        {   if (arr2[i] % 2 == 0)
        {
            System.out.println(arr2[i] + " je djeljiv sa 2");
            //break; - ako zelimo da provjerimo da li u ovom nizu imamo broj djeljiv sa 2
        }
        else
        {
            System.out.println(arr2[i] + " nije djeljiv sa 2");
        }

        }

        List<String> a = new ArrayList<String>(); // ArrayList is a class in Java
        // create object of the class - object.method
        a.add("katarina");
        a.add("tennis");
        a.add("film");
        a.add("selenium");
        //a.remove(2);
        //a.get(3); // extract the third value
        System.out.println("Treca stavka u nizu je " + a.get(3));
        System.out.println(a);

        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("**********************");

        for (String val :a)
        {
            System.out.println(val);
        }
        // Check if "Selenium is present in this ArrayList"
        System.out.println(a.contains("selenium"));

        String[] name = {"rahul", "shetty", "selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("selenium");


    }
}
