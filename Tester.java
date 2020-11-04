import java.util.Arrays;

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
        
        // 11/4
        SuperArray list2 = new SuperArray();

        System.out.println(!list.isEmpty());
        System.out.println(list2.isEmpty());

        list.clear();

        System.out.println(list.isEmpty());

        System.out.println("\ntoString:");
        System.out.println(list);
        System.out.println(list2);

        list.add("ABC");
        list.add("123");
        list.add("");
        list.add("ahahahahahahahhahhhhhh");
        for (int i = 0; i < 12; i++) {
            list.add(1, Integer.toString(i));
        }

        System.out.println(list);

        System.out.println("list contains \"123\": " + list.contains("123"));
        System.out.println("list contains \"321\": " + list.contains("321"));

        System.out.println("remove index 2:");
        System.out.println(list.remove(2));
        System.out.println(list);
        
        // // removes everything but the first and last item
        // while (list.size() > 2) {
        //     System.out.println("removed: " + list.remove(1));
        // }
        // System.out.println(list);

        System.out.println("Expected 0: " + list.indexOf("ABC"));
        System.out.println("Expected 14: " + list.indexOf("ahahahahahahahhahhhhhh"));
        System.out.println("Expected -1: " + list.indexOf("23"));

        System.out.println("\ntoArray (should be the same):");
        System.out.println(list.toString());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list2.toString());
        System.out.println(Arrays.toString(list2.toArray()));
    }
}