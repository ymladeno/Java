class Factorial {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        System.out.println(factorial(i));
    }

    // public static int factorial(int i) {
    //     int result = i;
    //     if (i == 0) return result;
    //     else {
    //         while (i != 1) {
    //             result *= --i;
    //         }
    //         return result;
    //     }
    // }

    public static int factorial(int i) {
        if (i == 1) return i;
        else return i * factorial(i-1);
    }
}