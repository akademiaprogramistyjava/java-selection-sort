public class SelectionSort {

    public static int[] sort(int[] d){
        int n = d.length;
        int i,j,pMin;

        for (j = 0; j < n-1 ; j++) {
            pMin = j;
            for (i = j+1; i < n ; i++) {
                if(d[i] < d[pMin]){
                    pMin = i;
                }
            }
            int tmp = d[j];
            d[j] = d[pMin];
            d[pMin] = tmp;
        }

        return d;
    }
}
