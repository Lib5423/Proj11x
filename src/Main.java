import com.sun.jdi.CharValue;
import inher.Machine;

import java.io.OutputStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Conter cn = new Conter();
        cn.ind = 1;
        employee emp = new employee();

        Machine mn = new Machine();

        mn.wash();

        emp.setName("Gwembere");

        System.out.println(emp.getName());
        System.exit(1);
        System.out.println("The conter is "+cn.ind);

      try(Scanner sc = new Scanner(System.in)){
          int i = 0;
          while(true & i<1){
              System.out.println("Kindly enter any numeric integer\n");
              int num = sc.nextInt();
              int num2 = sc.nextInt();
              if (num > 0 & num2 > 0){
                  int sum = num + num2;
                  System.out.println(sum);
              }
              else{
                  System.out.println(OutputStream.nullOutputStream());
              }
              i++;
          }
      }


    }

}
