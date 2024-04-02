public class MethodsDemo {
    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo(); // creating an object of a class
        String name = getData();
        System.out.println(name);
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        getData2();

    }
    // Why method? - If you want to reuse some code, make methods. To use methods, we have to create object of that class, and using that object we can call a method
// When we put static, then this method will belong to a class, not object
    public static String getData()
    {
        System.out.println("Test");
        return "Katarina";
    }

    public static String getData2()
    {
        System.out.println("Test");
        return "Katarina";
    }
}
