public class Variable {
    public static void main(String[] args) {
        // Default value String = null
        String name;
        name = "Eko Kurniawan Khannedy";

        // int age = 30;

        // String address = "Indonesia";
        System.out.println(name);

        name = "Hermawan Adi Prasetyo";
        System.out.println(name);


        var name2 = "Eko Kurniawan Khannedy";
        // var age; // error --> Cannot use 'var' on variable without initializer
        // age = 30;
        var age = 30;
        var address = "Indonesia";
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address);


    }
}