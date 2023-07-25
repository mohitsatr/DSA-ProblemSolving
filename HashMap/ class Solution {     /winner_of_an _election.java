
class Solution {
    // Function to return the name of the candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxvotes = 0;
        String cname = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int vote = entry.getValue();

            if (vote > maxvotes) {
                maxvotes = vote;
                cname = name;
            } else if (vote == maxvotes) {
                if (name.compareTo(cname) < 0) {
                    cname = name;
                }
            }
        }

        String[] res = { cname, Integer.toString(maxvotes) };
        return res;
    }
}
