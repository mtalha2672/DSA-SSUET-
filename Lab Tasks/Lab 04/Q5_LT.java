public class Q5_LT {
    public int[] merge(int[] array2,int[] array1) {
        int totalLength = array2.length + array1.length;
        int[] merge = new int[totalLength];
        int check = 0;
        int k = 0;

        for (int i = 0; i < totalLength; i++) {
            if (check > +array1.length - 1) {
                merge[i] = array2[k];
                k++;
            } else {
                merge[i] = array1[check];
                check++;
            }
        }
        return merge;
    }

    public int[] removeDuplication(int[] c){
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i] == c[j]){
                    c[j]=0;
                }
            }
        }

        int length = 0;
        for(int i=0;i<c.length;i++){
            if (c[i]!=0){
                length++;
            }
        }
        int[] removed =new int[length];

        int j = 0;
        int k = 0;
        while(j<length){
            if (c[j]!=0){
                removed[j] = c[k];
            } else {
                int l=k;
                while(l<c.length && c[l+1]==0){
                    l++;
                }
                k = l;
                removed[j] = c[k+1];
                k++;
            }
            k++;
            j++;
        }
        return removed;
    }

    public static void main(String[] args) {
        Q5_LT obj1 = new Q5_LT();
        int[] array1 = {1,2,3,4};
        int[] array2 = {3,1,2,8};
        int[] c = obj1.merge(array2,array1);

        System.out.print("Merged Array : [ ");
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.println("]");

        int[] finalVer = obj1.removeDuplication(c);

        System.out.print("Removed Duplicated Array : [ ");
        for(int j: finalVer){
            System.out.print(j+" ");
        }
        System.out.println("]");
    }
}


