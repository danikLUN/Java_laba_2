import java.util.Arrays;

public class Main {
    public void main(String[] args) {
        Sound s1 = new Sound(new int[]{ 0, 0, 0, 2, 3, 4, 4});
        System.out.println(s1.limitAmplitude(2000));
        s1.trimSilenceFromBeginning();
        s1.print();
    }
}

class Sound {
    private int [] Item;
    int n;

    public Sound(int[] numb) {
            this.Item = numb;
            this.n = Item.length;
        }

    public int limitAmplitude(int limit) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if (Math.abs(Item[i]) > limit) {
                Item[i] = limit * Integer.signum(Item[i]);
                count++;
            }
        }
        return count;
    }

    public void trimSilenceFromBeginning(){
        int i = 0;
            for(; Item[i] == 0; i++){
            }
        int[] new_arr = new int[n - i];
            new_arr = Arrays.copyOfRange(Item, i, n);
            Item = new_arr;
    }

    public void print(){
        System.out.println(Arrays.toString(this.Item));
    }
}