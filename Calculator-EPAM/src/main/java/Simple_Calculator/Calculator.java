package Simple_Calculator;
import java.util.Scanner;
public class Calculator
   {
      public static void main(String args[])
      {
    	    Scanner s=new Scanner(System.in);
            String operator_of_your_choice;
            ArithmeticOperations[] list_of_operations={new Addition(),new Subtraction(),new Division(),new Multiplication()};
       	    String[] list_of_operators= {"+","-","/","*"};
       	    double value1,value2;
       	    int invalid_flag;
            while(true)
              {
            	 invalid_flag=0;
                 System.out.println("Choose an operator of your choice:\n1. + for Addition\n2. - for Subtraction\n3. * for Multiplication/\n4. / for Division");
                 operator_of_your_choice=s.next();
                 for(int i=0;i<list_of_operators.length;i++)
                 {
                	 if(operator_of_your_choice.equals(list_of_operators[i]))
                	 {
                		 System.out.println("Enter two values on which the operation is to be performed::");
                         value1=s.nextDouble();
                         value2=s.nextDouble();
                		 list_of_operations[i].perform_arithmetic_operation(value1,value2);
                		 invalid_flag=1;
                		 break;
                	 }
                 }
                 if(invalid_flag==0)
                	 System.out.println("The operator that you have chosen is Invalid.Choose appropriate operator...");
                 System.out.println("Do you want to perform another operation(yes/no)");
                 String choice=s.next();
                 if(choice.contentEquals("no"))
                	 break;
               }
             s.close();
         }
    }



