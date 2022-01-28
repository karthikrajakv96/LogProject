import org.apache.log4j.Logger;

import java.util.Scanner;

public class LogMain {
    private static final Logger log = Logger.getLogger(LogMain.class);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer(x to exit): ");

        while (true) {
            for (int i = 0; i < 600000000; i++) {
                log.info("Testing log : " + i);
            }

            if (!in.hasNextInt()) {
                if (in.next()
                        .equals("x")) {
                    break;
                }
            }
        }
    }

    //void sdsa(){
    //    System.out.print("Enter an integer(x to exit): ");
    //    if(!in.hasNextInt())
    //    {
    //        if(in.next().equals("x"))
    //        {
    //            break;
    //        }
    //        else
    //        {
    //            System.out.println("*** Invalid data entry ***");
    //        }
    //    }
    //
    //}

}