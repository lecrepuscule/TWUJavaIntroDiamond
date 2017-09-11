package com.company;

public class Main {

    public static void drawAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static StringBuffer getSpacePadding(int n) {
        StringBuffer padding = new StringBuffer("");
        for (int i = 1; i < n; i++) {
            padding = padding.append(" ");
        }
        return padding;
    }

    public static StringBuffer padAsterisk(StringBuffer sb) {
        sb = sb.append("**");
        return sb;
    }

    public static StringBuffer padSpace(StringBuffer originalString, StringBuffer spacePadding) {
        StringBuffer paddedString = new StringBuffer(spacePadding);
        return paddedString.append(originalString);

    }

    public static StringBuffer reducePadding(StringBuffer padding) {
        return padding.replace(padding.length() -1, padding.length(), "");
    }

    public static String[] printIsoscelesTriangle(String num) {
        int n = Integer.parseInt(num);
        StringBuffer paddedS = new StringBuffer("*");
        StringBuffer stringPadding = getSpacePadding(n);
        StringBuffer paddedLine = padSpace(paddedS, stringPadding);
        String[] diamond = new String[n];
        diamond[0] = paddedLine.toString();
        System.out.println(diamond[0]);

        for (int i = 1; i < n; i++) {
            paddedS = padAsterisk(paddedS);
            stringPadding = reducePadding((stringPadding));
            diamond[i] = padSpace(paddedS, stringPadding).toString();
            System.out.println(diamond[i]);
        }

        return diamond;
    }

    public static void printDiamond(String num) {
        String[] diamond = printIsoscelesTriangle(num);

        for (int i = diamond.length-2; i >= 0; i--) {
            System.out.println(diamond[i]);
        }

    }

    public static void main(String[] args) {
        printDiamond(args[0]);
    }
}
