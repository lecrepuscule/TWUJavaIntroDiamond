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

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StringBuffer paddedS = new StringBuffer("*");
        StringBuffer stringPadding = getSpacePadding(n);
        StringBuffer paddedLine = padSpace(paddedS, stringPadding);
        System.out.println(paddedLine);

        for (int i = 1; i < n; i++) {
            paddedS = padAsterisk(paddedS);
            stringPadding = reducePadding((stringPadding));
            System.out.println(padSpace(paddedS, stringPadding));

        }

    }
}
