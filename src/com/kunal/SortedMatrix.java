package com.kunal;
import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int target =18;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr,int target){
        int rows=arr.length, cols = arr[0].length;
        int s=0, e=rows-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m][0]<=target&&arr[m][cols-1]>=target){
                return binarySearch(arr,m,target);
            }
            if(arr[m][0]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return new int[] {-1,-1};
    }

    private static int[] binarySearch(int[][] arr, int m, int target) {
        int s=0,e=arr[0].length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[m][mid]==target){
                return new int[] {m,mid};
            }
            else if(arr[m][mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
    //
//    static int[] BinarySearch(int[] matrix, int row ,int Cstart, int Cend,int target){
//while(Cstart < Cend ){
//    int mid = Cstart + (Cend - Cstart) / 2;
//    if (matrix[row][mid] == target){
//        return new int[]{row,mid};
//    }
//    if(matrix[row][mid] < target){
//        Cstart = mid + 1;
//    }
//    else{
//        Cend = mid - 1;
//    }
//}
//return new int[]{-1,-1};
//
//    }
//    static int[] search(int[][] matrix, int length){
//        int rows  = matrix.length;
//        int cols = matrix[0].length;
//        if(rows == 1){
//            return BinarySearch(matrix,0,0,cols - 1, target);
//        }
  //  }

