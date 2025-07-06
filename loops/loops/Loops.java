package loops;

import java.io.IOException;

public class Loops {

  public static void main(String[] args) throws IOException{
    // while
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x--);
    }

    //do-while
    int y = 3;
    do{
      System.out.println("y is " + y--);
    }while(y < 0);

    // for
    for(int z = 3; z > 0; z--){
      System.out.println("z is " + z);
    }

    // foreach
    int[] numbers = {0, 1, 2};
    for(int a : numbers){
      System.out.println(a);
    }
  }
}
