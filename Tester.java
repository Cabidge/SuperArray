public class Tester {
    public static void main(String[] abcdefghijklmnopqrstuvwxyz) {
        SuperArray list = new SuperArray();

        System.out.println("Should all be true:");
        
        System.out.println(list.size() == 0);
        System.out.println(list.add("Cowabunga"));
        System.out.println(list.size() == 1);
    }
}