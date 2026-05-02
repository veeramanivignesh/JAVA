public class merger {
    static void merge(int [] arr,int [] left,int [] right){
        int leftsize=arr.length/2;
        int rightsize=arr.length-leftsize;
        int i=0,j=0,k=0;

        while(i<leftsize && j<rightsize){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<leftsize){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<rightsize){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
 
    static void mergerSort(int [] arr){

        int len=arr.length;
        if(len<=1){
            return;
        }
        int mid=len/2;
        int [] left=new int[mid];
        int [] right=new int[len-mid];
        int i=0;
        int j=0;

        for(;i<len;i++){
            if(i<mid){
                left[i]=arr[i];
            }
            else{
                right[j]=arr[i];
                j++;
            }
        }
        mergerSort(left);
        mergerSort(right);
        merge(arr,left,right);


    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergerSort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
}