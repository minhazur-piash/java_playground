package playground;

/**
 * Created by minhazur on 6/29/16.
 */
public class OrderedArray {
    private int numberOfElements;
    private int[] data = new int[10];

    public void insert(int value) {
        if (numberOfElements < data.length){

            int j;
            for(j = numberOfElements - 1; j >= 0; j--){
                if(value < data[j]) {
                    data[j+1] = data[j];
                } else {
                    break;
                }
            }

            data[j+1] = value;
            numberOfElements++;
        }
    }

    public void print() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
