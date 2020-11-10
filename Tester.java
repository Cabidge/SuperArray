public class Tester {
    public static void main(String[] abcdefghijklmnopqrstuvwxyz) {
        SuperArray list;

        // constructor
        try {
            list = new SuperArray(-1);
            System.out.println("This shouldn't print");
        } catch (IllegalArgumentException err) {
            System.out.println("constructor error caught");
        }
        
        list = new SuperArray();
        for (int i = 0; i < 20; i++) {
            list.add("wo" + i);
        }

        // get()
        // negatives
        try {
            list.get(-1);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }
        try {
            list.get(-2);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }
        try {
            list.get(-32);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }

        // >= size
        try {
            list.get(20);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }
        try {
            list.get(22);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }
        try {
            list.get(25);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("get() error caught");
        }
    }
}