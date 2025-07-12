 import java.util.*;
 class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        // Now using selection sort for sort the array in ascending order and then print the min and max values
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[min_index]){
                    int temp=arr[j];
                    arr[j]=arr[min_index];
                    arr[min_index]=temp;
                }
            }
        }
            System.out.println("The minimum value is : "+arr[0]);
            System.out.println("The maximum value is : "+arr[n-1]);
            
            int sum=0;
            for(int k=0;k<n;k++){
                sum+=arr[k];
            }
            System.out.printf("The average value of the given array elements is : %.1f",(sum/(float)n));    
        }
 }
