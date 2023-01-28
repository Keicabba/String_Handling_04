package it.figuccia;

public class Start {
    public static void main(String[] args) {
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        veryLongString = veryLongString.replace("um", "HUM");

        String[] substrings = veryLongString.split("aliquip", 2);
        String sub1 = substrings[0].trim();
        String sub2 = substrings[1].trim();

        boolean searchInSub1 = sub1.contains("est");
        boolean searchInSub2 = sub2.contains("est");

        System.out.println("sub1: " + sub1);
        System.out.println("sub2: " + sub2);
        System.out.println("Search in sub1: " + searchInSub1);
        System.out.println("Search in sub2: " + searchInSub2);
        System.out.println("Exclusive OR result: " + (searchInSub1 ^ searchInSub2));
    }
}
