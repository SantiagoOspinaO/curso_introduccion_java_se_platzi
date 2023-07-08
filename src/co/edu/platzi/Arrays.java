package co.edu.platzi;

public class Arrays {
    public static void main(String[] args) {
        String[][] cities = new String[4][2];

        cities[0][0] = "Colombia";
        cities[1][0] = "Colombia";
        cities[2][0] = "Brasil";
        cities[3][0] = "Brasil";
        cities[0][1] = "Pasto";
        cities[1][1] = "Armenia";
        cities[2][1] = "Sao Paolo";
        cities[3][1] = "Rio de Janeiro";

        System.out.print("_________________________\n");
        System.out.print("|" + cities[0][0] + "|" + cities[0][1] + "         |\n");
        System.out.print("|" + cities[1][0] + "|" + cities[1][1] + "       |\n");
        System.out.print("|" + cities[2][0] + "  |" + cities[2][1] + "     |\n");
        System.out.print("|" + cities[3][0] + "  |" + cities[3][1] + "|\n");
        System.out.print("-------------------------\n");
    }
}
