class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5};
        int target = 9;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
