package pack;

public class DataStructures {
    // int arr
    public int findEl(int[] arr,  int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // int arr delete el by index
    public int[] returnList(int[] arr, int pos){
        int[] output = new int[arr.length - 1];
        int count = pos;
        for (int i = 0; i < pos; i++){
            output[i] = arr[i];
        }
        while (count < arr.length - 1){
            output[count] = arr[count + 1];
            count++;
        }
        return output;
    }

    // binary search in array
    public int binarySearch(int[] arr, int start, int end, int key){
        int middle = (start + end)/2;
        int pos = -1;
        if (key == arr[middle]){
            return middle;
        }
        if (key > middle){
            return binarySearch(arr, (middle + 1), end, key);
        }
        return binarySearch(arr, start, (middle - 1), key);
    }

}
