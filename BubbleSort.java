class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,8,3,1,2};
        //BUBBLE SORTING
        // take largest element in place it at the end of an array.
        //run loop till N-1 
        //Time complexity = O(n square)
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }    
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
