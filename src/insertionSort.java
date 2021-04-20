public class insertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] array){
        int pos, x,temp;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + " ");
                }
                System.out.print("\n");
                temp = array[pos];
                array[pos] = array[pos-1]; // đổi chỗ
                array[pos-1]=temp;
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
