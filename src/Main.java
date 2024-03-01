public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        double average = 0;
        for (int i = 0; i<numbers.length; i++){
            sum += 1/(numbers[i]);
        }
        average = numbers.length/sum;
        System.out.println(average);
    }
}