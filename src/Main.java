import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        firstTask("iNeuron");

        secondTask("Think Twice");

        thirdTask("ineuron", "urenino");

        fourthTask("Abacdefghijklmnopqrstuvwxaaxxyzzz");

        fifthTask("alloha");

        sixthTask("gfdcAvadBcb");

        seventhTask("A1111gaaa");

        eighthTask("123df s!$*)");
    }

    public static void firstTask(String input) {
        System.out.println("firstTask:\n");

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
        System.out.println("****************\n");
    }

    public static void secondTask(String input) {
        System.out.println("secondTask:\n");

        String output = "";

        String [] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int y = arr[i].length() - 1; y >= 0; y--) {
                if (arr[i].charAt(y) >= 'a' &&  arr[i].charAt(y) < 'z') {
                    output += arr[i].charAt(y);
                } else {
                    output += (char)(arr[i].charAt(y)+32);
                }
            }
            output += " ";
        }

        System.out.println(output);
        System.out.println("****************\n");
    }

    public static void thirdTask(String string1, String string2) {
        System.out.println("thirdTask:\n");

        if (string1.length() != string2.length()) {
            System.out.println(false);
            System.out.println("****************\n");
            return;
        }

        char[] charArr1 = string1.toCharArray();
        char[] charArr2 = string2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        System.out.println(Arrays.equals(charArr1, charArr2));
        System.out.println("****************\n");
    }

    public static void fourthTask(String input) {
        System.out.println("fourthTask:\n");

        input = input.toLowerCase();
        char [] asciiArray = new char[26];
        int numberOfAlphabetCharacters = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {

                for (int j = 0; j < asciiArray.length; j++) {
                    if (asciiArray[j] == input.charAt(i)) {
                        break;
                    } else if (asciiArray[j] == '\u0000') {
                        asciiArray[numberOfAlphabetCharacters] = input.charAt(i);
                        numberOfAlphabetCharacters++;
                        break;
                    }
                }
            }
        }

        if (numberOfAlphabetCharacters == 26) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("****************\n");
    }

    public static void fifthTask(String input) {
        System.out.println("fifthTask:\n");

        char[] array = input.toCharArray();

        System.out.print("Duplicate Characters: ");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("****************\n");
    }

    public static void sixthTask(String input) {
        System.out.println("sixthTask:\n");

        input = input.toLowerCase();

        char [] array = input.toCharArray();

        char temp;
        int i = 0;

        while (i < array.length) {
            int j = i+1;

            while (j < array.length) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                j++;
            }
            i++;
        }
        System.out.println(array);
        System.out.println("****************\n");
    }

    public static void seventhTask(String input) {
        System.out.println("seventhTask:\n");

        input = input.toLowerCase();

        int vovelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vovelsCount++;
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                consonantsCount++;
            }
        }
        System.out.println("Vovels: " + vovelsCount + ", Consonats: " + consonantsCount);
        System.out.println("****************\n");
    }

    public static void eighthTask(String input) {
        System.out.println("eighthTask:\n");

        input = input.toLowerCase();
        int countNumberOfSpecialCharacters = 0;

        for (char ch: input.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ') {
            } else {
                countNumberOfSpecialCharacters++;
            }
        }
        System.out.println("Number of special characters: " + countNumberOfSpecialCharacters);
        System.out.println("****************\n");
    }
}
