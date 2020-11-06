public class Tester {
    public static void main(String[] abcdefghijklmnopqrstuvwxyz) {
        SuperArray list = new SuperArray();
        
        list.add("123");
        list.add("123");
        list.add("ABC");
        list.add("ABC");
        list.add("123");
        list.add("123");
        list.add("ABC");
        list.add("123");

        System.out.println(list);
        System.out.println("First \"ABC\": " + list.indexOf("ABC"));
        System.out.println("Last \"ABC\": " + list.lastIndexOf("ABC"));
    }
}