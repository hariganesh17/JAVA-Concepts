package ControlFlow;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For loop..");
        for (int i = 1; i <= 3; i++) {
            System.out.println("iterating: " + i);
        }
        System.out.println("while loop..");
        int j=1;
        while(j<=3){
            System.out.println("iterating: "+j);
            j++;
        }
        System.out.println("do while");
        int k=1;
        do{
            System.out.println("iterating: "+k);
            k++;
        }while(k<=3);
    }
}
