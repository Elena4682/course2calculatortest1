package pro.sky.course2calculatortest1;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    public String text(){
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int number1,int number2){
        int sum = number1 + number2;
        return number1+ " + " +number2+ " = " +sum;
    }

    public String subtraction(int number1,int number2){
        int dif = number1 - number2;
        return number1+ " - " +number2+ " = " +dif;
    }

    public String multiplication(int number1,int number2){
        int com = number1 * number2;
        return number1+ " * " +number2+ " = " + com;
    }

    public String division(float number1,float number2){
        float pr = number1 / number2;
        if (number2==0){
            throw new IllegalArgumentException();
        }
        return number1+ " / " +number2+ " = " + pr;
    }
}
