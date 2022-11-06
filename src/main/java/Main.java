public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 25; x++) {
            for (int y = 0; y < 25; y++) {
                System.out.print((x >= y) ? ". " : "# ");
            }
            System.out.println();
        }
    }
}
