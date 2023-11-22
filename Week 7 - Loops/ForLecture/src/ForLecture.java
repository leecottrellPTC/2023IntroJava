import java.util.Scanner;

public class ForLecture {
    private static Scanner keyboard = new Scanner(System.in);
    //basic counting loop
    public static void countingLoop(){
        //display values from 1 to 10
        for(int x = 1; x <= 10; x++){
            System.out.println(x);
        }
    } 
    public static void countingLoop(int ending){
        //display values from 1 to 10
        //for(int x = 1; x <= ending; x++){
        for(int x = 1; x <= ending; x+= 2){
            System.out.println(x);
        }
    } 
    public static void countDown(){
        for(int c = 999; c >= 0; c--){
            System.out.printf("%5d", c);
            if(c % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int calcAvgGrade(int numTests){
        int avg = 0;
        int test;
        int total = 0;  //accumulator variable
        int counter = 0;
        for(counter = 1; counter <= numTests; counter++){
            System.out.print("Enter test #" + counter  + "--> ");
            try{
                test = keyboard.nextInt();
            }
            catch(Exception ex){
                test = 0;
                System.out.println("Invalid score, setting to 0");
                keyboard.nextLine();    //read the string from the buffer
            }
            total += test;  //keep the running total
            //total = total + test;
        }
        if(numTests > 0){
            avg = total / numTests;
        }
        else{
            avg= -1;
        }
        return avg;
    }

    public static void printLine(int length){
        for(int i=0; i < length; i++){
            System.out.print("-");
        }
    }
    public static void main(String[] args) throws Exception {
        //printLine(20);
        //System.out.println();
       // printLine(15);
      /*   for(int line = 1; line <=20; line++){
            printLine(line);
            System.out.println();
        }
        */
        String name = "Lee Cottrell";
        printLine(name.length());
        System.out.println("\n" + name);
        printLine(name.length());
        //countingLoop();
        //countingLoop(17);
        //countDown();
        //c++
        //int testAvg = calcAvgGrade(2);
        //System.out.println("Your average is " + testAvg);
        keyboard.close();
    }//end of main
}
