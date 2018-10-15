public class Fibonacci {
    int nPlace;



    public  int fiboReturn (int nPlace){
        if (nPlace <= 0){
            return 0;
        }
        else if(nPlace == 1){
            return 1;
        }
        else {
            return fiboReturn(nPlace -1)+fiboReturn(nPlace -2);
        }
    }
}