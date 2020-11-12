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
        // non errors
        try {
            list.get(0);
            System.out.println("get() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        try {
            list.get(19);
            System.out.println("get() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }

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

        // set
        // non errors
        try {
            list.set(0,"woah");
            System.out.println("set() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        try {
            list.set(19,"woah");
            System.out.println("set() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }

        // negatives
        try {
            list.set(-1,"oops");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("set() error caught");
        }
        try {
            list.set(-5,"oops");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("set() error caught");
        }

        // >= size
        try {
            list.set(20,"nope");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("set() error caught");
        }
        try {
            list.set(22,"nope");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("set() error caught");
        }

        // add
        // non errors
        try {
            list.add(0,"first!");
            System.out.println("add() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        try {
            list.add(list.size(),"last!");
            System.out.println("add() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        // IOOB
        try {
            list.add(-1,"first!");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("add() error caught");
        }
        try {
            list.add(list.size()+1,"last!");
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("add() error caught");
        }

        // remove
        // non errors
        try {
            list.remove(1);
            System.out.println("remove() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        try {
            list.remove(list.size()-2);
            System.out.println("remove() in range");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("This shouldn't print");
        }
        // IOOB
        try {
            list.remove(-1);
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("remove() error caught");
        }
        try {
            list.remove(list.size());
            System.out.println("This shouldn't print");
        } catch (IndexOutOfBoundsException err) {
            System.out.println("remove() error caught");
        }
    }
}