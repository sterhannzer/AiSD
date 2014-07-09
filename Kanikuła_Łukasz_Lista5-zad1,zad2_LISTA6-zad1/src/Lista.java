import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Łukasz on 2014-05-21.
 */
public class Lista {

    public ArrayList<Integer> generowanieLosowej(int iloscElemListy){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int losowaLiczba = 0;
        for(int i=0; i<iloscElemListy; i++){
            if(i%2 == 0){
                losowaLiczba += 20;
            }
            else {
                losowaLiczba -=13;
            }
            if(i%3 == 0){
                losowaLiczba += 17;
            }
            else{
                losowaLiczba -= 6;
            }
            lista.add(losowaLiczba);
        }
        return lista;

    }

    public ArrayList<Integer> generowanieRosnacej(int iloscElemListy){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<iloscElemListy; i++){

            lista.add(i+1);
        }
        return lista;
    }


    public ArrayList<Integer> generowanieMalejacej(int iloscElemListy){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<iloscElemListy; i++){
            lista.add(iloscElemListy-i);
        }
        return lista;
    }
}
