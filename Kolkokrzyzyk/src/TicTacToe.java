import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] agrs){
        System.out.println("Gra rozpoczyna się");
        System.out.println("Podaj wymiar planszy:");
        int wymiar=new Scanner(System.in).nextInt();
        char[][] plansza=new char[wymiar][wymiar];


        char aktualnyGracz='X';

        int iloscPol=wymiar*wymiar;
        int licznikRuchow=0;
        boolean rozgrywka=true;

        while(licznikRuchow<=iloscPol && rozgrywka){
            DrukujPlansze(plansza,wymiar);
            boolean graj=PodajWspolrzedne(plansza,aktualnyGracz);
            if(graj){
                licznikRuchow++;
                boolean sprawdzenieWiersza= SprawdzanieWygranej.czyWiersz(plansza,aktualnyGracz,wymiar);
                boolean sprawdzenieKolumny= SprawdzanieWygranej.czyKolumna(plansza,aktualnyGracz,wymiar);
                boolean sprawdzenieSkos1= SprawdzanieWygranej.czySkos1(plansza,aktualnyGracz,wymiar);
                boolean sprawdzenieSkos2= SprawdzanieWygranej.czySkos2(plansza,aktualnyGracz,wymiar);
                if(sprawdzenieKolumny || sprawdzenieSkos1 || sprawdzenieWiersza || sprawdzenieSkos2){
                    DrukujPlansze(plansza,wymiar);
                    System.out.println("Gratulacje, wygral gracz: "+aktualnyGracz);
                    rozgrywka=false;
                }
                aktualnyGracz = aktualnyGracz == 'X' ? 'O' : 'X';
            }
        }
    }

    public static boolean PodajWspolrzedne(char[][] plansza,char aktualnyGracz){
        System.out.println("Ruch ma teraz gracz: "+aktualnyGracz);
        System.out.println("Podaj wiersz: ");
        int wiersz=new Scanner(System.in).nextInt();
        System.out.println("Podaj kolumne: ");
        int kolumna=new Scanner(System.in).nextInt();
        boolean ruch = plansza[wiersz][kolumna] == 0;
        if(ruch){
            plansza[wiersz][kolumna]=aktualnyGracz;
            return true;
        }else{
            System.out.println("Podales bledne wspolrzedne");
            return false;
        }
    }

    public static void DrukujPlansze(char[][] plansza,int wymiar) {
        System.out.print("\t");
        int licznik;
        for(licznik=0;licznik<wymiar;licznik++){
            System.out.print(licznik+"\t");
        }
        System.out.println();

        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz+"\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }

}

