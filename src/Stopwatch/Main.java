package Stopwatch;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        stopwatch.selectionSort(array);
        stopwatch.stop();
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}
