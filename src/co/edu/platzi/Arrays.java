package co.edu.platzi;

public class Arrays {
    public static void main(String[] args) {
        String days[] = new String[7];
        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        String[][] cities = new String[4][2];
        cities[0][0] = "Colombia";
        cities[1][0] = "Colombia";
        cities[2][0] = "Brasil";
        cities[3][0] = "Brasil";
        cities[0][1] = "Pasto";
        cities[1][1] = "Armenia";
        cities[2][1] = "Sao Paolo";
        cities[3][1] = "Rio de Janeiro";

        String[] androidVersions = new String[17];
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.print("_________________________\n");
        System.out.print("|" + cities[0][0] + "|" + cities[0][1] + "         |\n");
        System.out.print("|" + cities[1][0] + "|" + cities[1][1] + "       |\n");
        System.out.print("|" + cities[2][0] + "  |" + cities[2][1] + "     |\n");
        System.out.print("|" + cities[3][0] + "  |" + cities[3][1] + "|\n");
        System.out.print("-------------------------\n");

        System.out.println();

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println();

        System.out.println(animals[1][0][0][1]);
    }
}
