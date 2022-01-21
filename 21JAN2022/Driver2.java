public class Driver2 {

    public static void main(String[] args) {

        String sentence = "I am [ John 1 ] My friend is [ John 2] [ John 3] [ John 4] ";
        int endIdx = -1;
        String subString = sentence.substring(endIdx + 1);

        while(subString.contains("[")) {

            int startingIdx = subString.indexOf("[");
            endIdx = subString.indexOf("]");
            String john = subString.substring(startingIdx, endIdx + 1);
            john = john.substring(1, john.length() - 1).trim();
            System.out.println(john);
            subString = subString.substring(endIdx + 1);
        }

        String[] words = {"A", "V"};
        System.out.print("[");
        for(String word: words) {
            System.out.print(word + ", ");
        }
        System.out.print("]");

    }
}
