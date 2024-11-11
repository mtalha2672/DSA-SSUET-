public class Q2_LT {
    public int[] merge(int[] array2,int[] array1){
        int totalLength = array2.length + array1.length;
        int[] merge = new int[totalLength];
        int check =0;
        int k = 0;

        for(int i=0; i < totalLength; i++){
            if (check >+array1.length-1){
                merge[i] = array2[k];
                k++;
            }
            else {
                merge[i] = array1[check];
                check++;
            }
        }
        return merge;
    }
    public static void main(String[] args) {
        Q2_LT obj = new Q2_LT();

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        int[] c = obj.merge(array2,array1);

        System.out.print("Merged Array : [ ");
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.println("]");
    }
}

