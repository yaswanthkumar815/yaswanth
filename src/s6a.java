public class s6a {
    public static void main(String[] args) {
        System.out.println();
        int[] arr={2,7,11,13};
        int target =9;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j =i+1; j<arr.length;j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}
