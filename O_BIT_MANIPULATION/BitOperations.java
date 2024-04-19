package O_BIT_MANIPULATION;

public class BitOperations {
    public static int[] bitManipulation(int num, int i){
        // Convert the 1-based index to a 0-based index for bit manipulation
        int zeroBasedIndex = i - 1;

        // 1. Getting the bit at the i-th position
        // Check if the bit at the given position is set and return 1 if true, 0 otherwise
        int getBit = (num & (1 << zeroBasedIndex)) != 0 ? 1 : 0;

        // 2. Setting the bit at the i-th position
        // Set the bit using OR operation
        int setBit = num | (1 << zeroBasedIndex);

        // 3. Clearing the bit at the i-th position
        // Clear the bit using AND operation with NOT of the mask
        int clearBit = num & ~(1 << zeroBasedIndex);

        // Return an array containing the results of the operations
        return new int[] {getBit, setBit, clearBit};
    }

    public static void main(String[] args) {
        // Test the function with sample input
        int num = 9;
        int i = 3;
        int[] results = bitManipulation(num, i);
        // Expected output for num=9, i=3 is "0 13 9"
        System.out.println(results[0] + " " + results[1] + " " + results[2]);
    }
}

