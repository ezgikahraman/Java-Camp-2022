public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Tekirdag";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Erzurum";
        sehirler[1][0] = "Eskisehir";
        sehirler[1][1] = "İzmir";
        sehirler[1][2] = "Edirne";
        sehirler[2][0] = "Istanbul";
        sehirler[2][1] = "Balikesir";
        sehirler[2][2] = "Van";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(sehirler[i][j]);
            }
            System.out.println();
        }
    }
}