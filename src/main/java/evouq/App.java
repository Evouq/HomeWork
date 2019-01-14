package evouq;

public class App 
{
    public static void main( String[] args ) {
       int[] arrOne = new int[20];
       double[] arrTwo = new double[20];

       ArrayHandler.initialArray(arrOne);
       ArrayHandler.initialArray(arrTwo);
       ArrayHandler.printArray(arrTwo);


    }
}
