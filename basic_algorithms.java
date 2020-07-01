//Thanks to LeetCode and JavaTPoint

class Solution {
  
  //Delete Duplicate Elements of Array
   public static int[] removeDuplicates(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int item : nums) 
          set.add(item);
        int len = set.size();
        int[] res = new int[len];
        int i = 0;
        for(int item : set) 
          res[i++] = item;
        return res; 
    }
  
  public static int[] removeDuplicates(int arr[]){
        int j = 0;
    //Menentukan ukuran elemen array
        for (int i=0; i<arr.length-1; i++)
            if (arr[i] != arr[i+1])
                j++;
         
        int[] new_arr = new int[j+1];
    //Mengisi elemen
        int k = 0;
        for (int i=0; i<arr.length-1; i++)
            if (arr[i] != arr[i+1])
                new_arr[k++] = arr[i];
         new_arr[k++] = arr[arr.length-1];
        return temp;
    }
  
      public static int removeDuplicates(int arr[]){
        if (arr.length==0 || arr.length==1){
            return arr.length;
        }  
        int j = 0;//for next element
        for (int i=0; i < arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        return j;
    }
    
    //1st Method using Two Pointers
    public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
  }
  
  //2nd Method
  public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}
  
    //Method to check if there are any elements of which value is double of another element
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> element_list = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&element_list.contains(arr[i]/2)||element_list.contains(2*arr[i]))
                return true;
            element_list.add(arr[i]);
        }
        return false;
    }
}
