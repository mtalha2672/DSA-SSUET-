public class Q4_HT {

    public static int checkMissingNumber(int[] a, int n){

        int[] totalArray = new int[a.length];
        for(int i = 0; i < a.length; i++){
            totalArray[i] = i;
        }

        int missingNumber = -1;
        boolean found = false;

        for(int i = 0; i < totalArray.length; i++){
            if (!found){
                for (int j=0; j < totalArray.length; j++){
                    if (totalArray[i] == a[j]){
                        break;
                    } else {
                        if (j == totalArray.length - 1){
                            missingNumber = totalArray[i];
                            found = true;
                            break;
                        }
                    }
                }
            } else {
                break;
            }
        }
        return missingNumber;
    }


    public static void main(String[] args) {
        int[] a = {0,1,2,4,6,3};
        int missingNumber = checkMissingNumber(a,6);
        System.out.println("Missing number: " + missingNumber);
    }
}

