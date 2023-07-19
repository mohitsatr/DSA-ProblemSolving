
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0 ;i<n;i++){
            if(map.containsKey(arr[i])){
                return true;
            }else if(arr[i] < x){
                map.put(x-arr[i],arr[i]);
            }
            
        }
        
        return false ;
    }
}


