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

    public static String[] makeIsoscelesTriangle(String num){
        int n = Integer.parseInt(num);
        StringBuffer paddedS = new StringBuffer("*");
        StringBuffer stringPadding = getSpacePadding(n);
        StringBuffer paddedLine = padSpace(paddedS, stringPadding);
        String[] isoTriangle = new String[n];
        isoTriangle[0] = paddedLine.toString();

        for (int i = 1; i < n; i++) {
            paddedS = padAsterisk(paddedS);
            stringPadding = reducePadding((stringPadding));
            isoTriangle[i] = padSpace(paddedS, stringPadding).toString();
        }

        return isoTriangle;
    }

    public static void printIsoscelesTriangle(String[] isoTriangle) {
        for (int i = 0; i < isoTriangle.length; i++) {
            System.out.println(isoTriangle[i]);
        }
    }

    public static void printDiamond(String[] isoTriangle) {
        printIsoscelesTriangle(isoTriangle);
        for (int i = isoTriangle.length-2; i >= 0; i--) {
            System.out.println(isoTriangle[i]);
        }
    }

    public static void printDiamondWithName(String[] isoTriangle){
        StringBuffer name = new StringBuffer(isoTriangle[isoTriangle.length-1]);
        int padding = name.length() / 2;
        StringBuffer spacePadding = getSpacePadding(padding);
        StringBuffer myName = new StringBuffer("Yao");
        isoTriangle[isoTriangle.length-1] = padSpace(myName, spacePadding).toString();
        printDiamond(isoTriangle);
    }

    public static void main(String[] args) {
        String[] isoTriangle = makeIsoscelesTriangle(args[0]);

        System.out.println("print triangle: ");
        printIsoscelesTriangle(isoTriangle);

        System.out.println("print diamond: ");
        printDiamond(isoTriangle);

        System.out.println("print diamond with name: ");
        printDiamondWithName(isoTriangle);
    }
}
