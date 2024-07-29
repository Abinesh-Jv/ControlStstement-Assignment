public class SecondOccurence {
    public static void main(String[] args) {
        int[] numbers = {0,6,0,0,6,0,};
        int number = 6;
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==number)
                count++;
            if(count==2){
                System.out.println("Second occurence at index "+i);
                System.exit(0);
            }
        }
        System.err.println("No Second occurence");
    }
}
