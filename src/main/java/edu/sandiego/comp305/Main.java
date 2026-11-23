package edu.sandiego.comp305;

public final class Main {

    private Main() {
    }

    /**
     * This class prints "Hello and welcome!"
     *
     * @param args : command line arguments
     */

    public static void main(final String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
