public class Demo {
    public static void main(String[] ah) {
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");

        System.out.println(words);
        //removeDuplicates(words);
        SuperArray WORDSB = new SuperArray();
        //grouped to save vertical space
        WORDSB.add("kani");   WORDSB.add("uni");     WORDSB.add("ebi");
        WORDSB.add("daba shouldn't be here");


        SuperArray wordsA = new SuperArray();
        //grouped to save vertical space
        wordsA.add("kani");   wordsA.add("uni");     wordsA.add("ebi");     wordsA.add("una");
        wordsA.add("una");    wordsA.add("ebi");     wordsA.add("kani");    wordsA.add("una");
        wordsA.add("una");    wordsA.add("ebi");     wordsA.add("toro");

        System.out.println(findOverlap(WORDSB, words));
        System.out.println("Should be true");
        System.out.println(words.equals(wordsA));
        System.out.println("Should be false");
        System.out.println(words.equals(WORDSB));

        String[] aStr = {"a","b","c","d","e","f"};
        String[] bStr = {"0","1","2","3"};
        String[] cStr = {"a","b","c"};
        String[] dStr = {"0","1","2","3","4"};
        SuperArray a = toSuper(aStr);
        SuperArray b = toSuper(bStr);
        SuperArray c = toSuper(cStr);
        SuperArray d = toSuper(dStr);

        System.out.println("[a, 0, b, 1, c, 2, d, 3, e, f] expected:");
        System.out.println(zip(a, b));
        System.out.println("[a, 0, b, 1, c, 2, 3, 4] expected:");
        System.out.println(zip(c, d));
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

    public static SuperArray zip(SuperArray a, SuperArray b) {
        SuperArray out = new SuperArray(a.size() + b.size());

        SuperArray biggest; // For filling in the last elements
        int minimumSize; // To determine how long to alternate between the two "lists"
        if (a.size() > b.size()) {
            minimumSize = b.size();
            biggest = a;
        } else {
            minimumSize = a.size();
            biggest = b;
        }

        // Alternating
        for (int i = 0; i < minimumSize; i++) {
            out.add(a.get(i));
            out.add(b.get(i));
        }

        // Fill
        for (int i = minimumSize; i < biggest.size(); i++) {
            out.add(biggest.get(i));
        }

        return out;
    }

    public static SuperArray toSuper(String[] arr) {
        SuperArray out = new SuperArray(arr.length);
        for (int i = 0; i < arr.length; i++) {
            out.add(arr[i]);
        }
        return out;
    }
}