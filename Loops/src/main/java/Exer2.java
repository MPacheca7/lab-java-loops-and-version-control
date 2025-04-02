public class Exer2 {
    public static void main(String[] args) {
        int[] miArray = {11, 8, 3, 7, 5};

        int menor1 = Integer.MAX_VALUE;
        int menor2 = Integer.MAX_VALUE;

        for (int num : miArray) {
            if (num < menor1) {
                menor1 = num;
            } else if (num < menor2) {
                menor2 = num;
            }
        }
        System.out.println(menor1);
        System.out.println(menor2);
    }
}


