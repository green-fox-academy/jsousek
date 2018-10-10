import java.util.ArrayList;
import java.util.List;

public class Sum {

    List<Integer> numbersList;
    int sum;

    public Sum(int sum) {
        this.sum = sum;
    }

    public Sum (List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public int  getSum ( ArrayList<Integer> list){
        this.sum =0;
        for (int a:list
             ) {sum+=a;
        }return sum;
    }
}
