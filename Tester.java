public class Tester {
    public static void main(String[] abcdefghijklmnopqrstuvwxyz) {
        SuperArray list = new SuperArray();

        System.out.println("Should all be true:");
        
        System.out.println(list.size() == 0);
        System.out.println(list.add("Cowabunga"));
        System.out.println(list.size() == 1);
        list.add("Kerblam");
        System.out.println(list.size() == 2);
        System.out.println(list.get(0).equals("Cowabunga"));
        System.out.println(list.get(1).equals("Kerblam"));
        System.out.println(list.set(0,"Cowabungus").equals("Cowabunga"));
        System.out.println(list.get(0).equals("Cowabungus"));

        for (int i = 0; i < 20; i++) {
            list.add("");
        }

        System.out.println(list.size() == 22);
        System.out.println(list.get(21).equals(""));
    }
}