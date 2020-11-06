public class Demo {
    public static void main(String[] ah) {
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro"); 

        System.out.println(words);
        removeDuplicates(words);
        System.out.println(words);

        SuperArray a = new SuperArray(6);
        a.add("9");
        a.add("1");
        a.add("2");
        a.add("2");
        a.add("3");
        a.add("4");

        SuperArray b = new SuperArray(5);
        b.add("0");
        b.add("4");
        b.add("2");
        b.add("2");
        b.add("9");

        SuperArray c = findOverlap(a, b);
        System.out.println(c);
    }

    public static void removeDuplicates(SuperArray s) {
        for (int i = s.size() - 1; i > 0; i--) {
            if (s.indexOf(s.get(i)) != i) {
                s.remove(i);
            }
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray out = new SuperArray();

        for (int i = 0; i < a.size(); i++) {
            String current = a.get(i);
            if (b.contains(current) && !out.contains(current)) {
                out.add(current);
            }
        }

        return out;
    }
}