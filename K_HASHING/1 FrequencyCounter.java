package K_HASHING;

import java.util.HashMap;

class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " appears " + frequencyMap.get(key) + " times");
        }
    }
}

