import java.util.ArrayList;

/**
 * Created by Łukasz on 2014-05-30.
 */
public class Lista6Zad1 {
    public int[] generowanieTablicy(){
        int[] tablica = new int[4000];
        for(int i=0; i<4000; i++){
            if(i%10 == 0 ){
                tablica[i]= i*17;

            }
            else{
                tablica[i] = i*2;
            }
            if(i%8 == 0){
                tablica[i] = (i*5-i*13);

            }
            else{
                tablica[i] = (i*25-i*19);

            }
        }
        return tablica;
    }

    public ArrayList<Integer> generowanieListy(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<4000; i++){
            if(i%10 == 0 ){
                lista.add(i*16);

            }
            if(i%8 == 0){
                lista.add(i*5);

            }
            else{
                lista.add(i%25);

            }
        }
        return lista;
    }

    public void zad1(){
        Sortowanie sortuj = new Sortowanie();

        ArrayList<Integer> lista = this.generowanieListy();
        ArrayList<Integer> lista2 = this.generowanieListy();
        int[] lista3 = this.generowanieTablicy();
        System.out.println();
        System.out.println();

        System.out.println("Insert Sort:");
        sortuj.insertSort(lista);
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj.liczbaPorownan, sortuj.liczbaPrzestawien));

        Sortowanie sortuj2 = new Sortowanie();
        System.out.println();
        System.out.println("Shell Sort:");
        sortuj2.insertSort(sortuj2.shellSort(lista2));
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj2.liczbaPorownan, sortuj2.liczbaPrzestawien));
        System.out.println();
        System.out.println();

        Sortowanie sortuj3 = new Sortowanie();
        Sortowanie sortuj4 = new Sortowanie();
        lista = this.generowanieListy();
        lista2 = this.generowanieListy();

        System.out.println("insert Sort:");
        sortuj4.insertSort(lista);
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj4.liczbaPorownan, sortuj4.liczbaPrzestawien));
        System.out.println();
        System.out.println("quick Sort:");
        sortuj3.quickSort(lista2, 0, lista.size()-1);
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj3.liczbaPorownan, sortuj3.liczbaPrzestawien));


        System.out.println();
        System.out.println();

        Sortowanie sortuj5 = new Sortowanie();
        MergeSort sortuj6 = new MergeSort(lista3);
        lista = this.generowanieListy();


        System.out.println("insert Sort:");
        sortuj5.insertSort(lista);
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj5.liczbaPorownan, sortuj5.liczbaPrzestawien));
        System.out.println();
        System.out.println("Merge Sort:");
        sortuj6.mergeSort();
        System.out.print(String.format("      Porówn.%d Przest.%d", sortuj6.liczbaPorownan, sortuj6.liczbaPrzepisan));

    }

}
