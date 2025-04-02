public class Exers3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;

        int expoX = (int) Math.pow(x, 2);
        System.out.println(expoX); // Comprobación x
        int expoY = (int) Math.pow(4, y);
        System.out.println(expoY); // Comprobación y

        int ope = (expoY / 5 - expoX) * 2;

        System.out.println(expoX + ope); // Resultado
    }

}
