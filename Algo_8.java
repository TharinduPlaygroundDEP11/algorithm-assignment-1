public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String stringUnion = "";
        String stringIntersection = "";
        String stringRelativeComplementAB = "";
        String stringRelativeComplementBA = "";
        String symmDiff = "";

        System.out.print("numA \u222A numB -> {");
        for (int i = 0; i < numA.length; i++) {
            stringUnion += numA[i] + ", ";
        }
        for (int i = 0; i < numB.length; i++) {
            stringUnion += numB[i] + ", ";
        }
        System.out.print(stringUnion);
        System.out.println("\b\b}");


        System.out.print("\nnumA \u2229 numB -> {");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    stringIntersection += numA[i] + ", ";
                }
            }
        }
        System.out.print(stringIntersection);
        System.out.println("\b\b}");


        System.out.print("\nnumA \\ numB -> {");
        for (int i = 0; i < numA.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    count++;
                }
            }
            if (count == 0) {
                stringRelativeComplementAB += numA[i] + ", ";
            }
        }
        System.out.print(stringRelativeComplementAB);
        System.out.println("\b\b}");

        System.out.print("\nnumB \\ numA -> {");
        for (int i = 0; i < numB.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
                if (numB[i] == numA[j]) {
                    count++;
                }
            }
            if (count == 0) {
                stringRelativeComplementBA += numB[i] + ", ";
            }
        }
        System.out.print(stringRelativeComplementBA);
        System.out.println("\b\b}");


        System.out.print("\nnumA \u2206 numB -> {");
        for (int i = 0; i < numA.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    count++;
                }
            }
            if (count == 0) {
                symmDiff += numA[i] + ", ";
            }
        }
        for (int i = 0; i < numB.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
                if (numB[i] == numA[j]) {
                    count++;
                }
            }
            if (count == 0) {
                symmDiff += numB[i] + ", ";
            }
        }
        System.out.print(symmDiff);
        System.out.println("\b\b}");

    }
}
