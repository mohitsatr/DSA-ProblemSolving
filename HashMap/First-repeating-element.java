class Solution {
    // Function to return the position of the first repeating element.
    
    public static int firstRepeated(int[] arr, int n) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                minheap.add(map.get(arr[i]));
            }else{
                map.put(arr[i],i+1);
                
            }
        }
        if(minheap.size() > 0){
            return minheap.poll();
        }else{
            return -1;
        }
    }
}
