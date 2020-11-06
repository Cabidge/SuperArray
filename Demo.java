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