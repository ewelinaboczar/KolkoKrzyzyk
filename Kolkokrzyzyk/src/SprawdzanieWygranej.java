public class SprawdzanieWygranej {
    public static boolean czySkos1 (char[][] plansza, char aktualnyGracz,int wymiar){
        for( int i = 0; i < wymiar; i++) {
            if ( plansza[i][i] != aktualnyGracz ) {
                return false;
            }
        }
        return true;
    }

    public static boolean czySkos2 (char[][] plansza, char aktualnyGracz,int wymiar){
        int j=wymiar-1;
        for( int i = 0; i < wymiar; i++) {
            if ( plansza[i][j] != aktualnyGracz ) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static boolean czyKolumna (char[][] plansza, char aktualnyGracz,int wymiar){
        for( int j = 0; j < wymiar; j++) {
            boolean sukces = true;
            for( int i = 0; i < wymiar; i++) {
                if ( plansza[i][j] != aktualnyGracz ) {
                    sukces = false;
                    break;
                }
            }
            if ( sukces ) {
                return true;
            }
        }

        return false;
    }

    public static boolean czyWiersz (char[][] plansza, char aktualnyGracz,int wymiar){
        for( int i = 0; i < wymiar; i++) {
            boolean sukces = true;
            for( int j = 0; j < wymiar; j++) {
                if ( plansza[i][j] != aktualnyGracz ) {
                    sukces = false;
                    break;
                }
            }
            if ( sukces ) {
                return true;
            }
        }
        return false;
    }

}
