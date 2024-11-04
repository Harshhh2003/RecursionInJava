public class SubsetGeneration {
    public static void generateSubsets(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current); // Base case
            return;
        }
        generateSubsets(str, current, index + 1); 
        generateSubsets(str, current + str.charAt(index), index + 1); 
    }

    public static void main(String[] args) {
        String str = "ABC";
        generateSubsets(str, "", 0);
    }
}
