public class NumberOfVowelsInAWord {
    public static void main(String[] args) {
        String sentence = "This is an example sentence.";
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }

    public static countVowels(String sentence) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < sentence.length(); i++) {
            if (vowels.indexOf(sentence.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}