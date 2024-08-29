package demo;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "30,000 foot", "B-to-B"};
        String[] wordListTwo = {"branded", "centric", "shared"};
        String[] wordListThree = {"process", "portal", "space"};


        int lengthOne = wordListOne.length;
        int lengthTwo = wordListTwo.length;
        int lengthThree = wordListThree.length;

        int rand1 = (int) (Math.random() * lengthOne);
        int rand2 = (int) (Math.random() * lengthTwo);
        int rand3 = (int) (Math.random() * lengthThree);


        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("what we need is a " + phrase);


    }
    }

