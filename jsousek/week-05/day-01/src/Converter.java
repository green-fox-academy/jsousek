public class Converter {
    public String ConvertOne(int number1){
        if (number1 == 1){
            return "one";
        }
        return "what";
    }

    public int lastDigit (int number2){
        if(number2 % 10 == 0){
            return number2;}
        else if(number2 % 10 != 0){
            return number2 % 10;
        }
        return -1;
    }
    public int lastDigitAndZero (int number2){
        if(number2 % 10 == 0){
            return 0;
        }
        else if(number2 % 10 != 0){
            return number2 % 10;
        }
        return -1;
    }
}
