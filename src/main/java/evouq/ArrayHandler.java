package evouq;

import java.util.Random;

import static java.lang.System.out;

public abstract class ArrayHandler {


    //display array elements
    public static void printArray(int[] array){
        int count = 1;
        out.println("Your array is: ");
        for (int i = 0; i < array.length; i++){
            out.print(" [" + i + "] = " + array[i] + '\t');
            if(count%2 == 0){
                out.println();
            }
            count++;
        }
    }

    public static void printArray(double[] array){
        int count = 1;
        out.println("Your array is: ");
        for (int i = 0; i < array.length; i++){
            out.print(" [" + i + "] = " + array[i] + '\t');
            if(count%2 == 0){
                out.println();
            }
            count++;
        }
    }

    public static void initialArray(int[] array){
        Random randValue = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randValue.nextInt(100);
        }
        out.println("The array is initialized");
    }

    //array initialization
    public static void initialArray(double[] array){
        Random randValue = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randValue.nextInt(100);
        }
        out.println("The array is initialized");
    }

    //sorting array in descending/ascending order
    public static void sortingAnArray(int[] array, char sortType){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                switch (sortType) {
                    case '>':
                        if (array[i] > array[i + 1]) {
                            toSwapItems(array, i, i + 1);
                        }
                        break;
                    case '<':
                        if (array[i] < array[i + 1]) {
                            toSwapItems(array, i, i + 1);
                        }
                        break;
                    default:
                        out.println("unknown action");
                        break;
                }
            }
        }
        switch (sortType){
            case '>':
                out.println("The array is sorted in ascending order");
                break;
            case '<':
                out.println("The array is sorted in descending order");
                default:
                    out.println("unknown action");
                    break;
        }
    }

    //counts the sum of array elements
    public static void arraySumCalc(int[] array){
        int summOfArray = 0;
        for (int i = 0; i < array.length; i++){
            summOfArray += array[i];
        }
        out.println("The sum of the elements of the array: " + summOfArray);
    }

    //a method that counts the number of array elements in a given interval
    public static void rangeOfNumbers(int[] array, int lowBorder, int topBorder){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > lowBorder & array[i] < topBorder){
                count++;
            }
        }
        out.println("Number of array elements from " + lowBorder +
                " to " + topBorder + ": " + count);

    }

    //searches for the hidden number by the user
    public static void itemSearch(int[] array, int value){
        out.println("You wished for the number: " + value);
        boolean findValue = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                findValue = true;
                break;
            }
        }

        if (findValue){
            out.println("The number you wish is contained in the array");
        }
        else
            out.println("The number you wish is not in the array");
    }

    //searches for odd elements in arrays
    public static void findOddElements(int[] array){
        out.println("Print odd-numbered array elements: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                out.println("array[" + i + "]= " + array[i]);
            }
        }
    }

    //removes even elements from an array
    public static void removeEvenNumb(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        out.println("Even numbers removed.");
    }

    //swaps by the specified index
    public static void toSwapItems(int[] array, int first, int second){
        int pint = 0;
        pint = array[second];
        array[second] = array[first];
        array[first] = pint;
    }

}
