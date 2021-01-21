public class CalculateFactorial {

    public static int calculateFactorial(int n){

        int result = 1;
        int i = 1;

        while(i <= n) {
            result = result*i;
            i++;
        }

        return result;
    }

}
