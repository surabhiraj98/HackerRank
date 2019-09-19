import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
      //finds the sum of all the divisor of n
     //parameter n The value whose divisor_sum is required
     //return The sum of divison
    public int divisor_sum(int n) {
        int sum = 1 + n; 
        // stores the sum of divisor 1 and n are always the divisor
        // if n is 1 return 1
        if (n == 1)
            return 1;

        //finds the divisor and updates the sum 
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}


class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

