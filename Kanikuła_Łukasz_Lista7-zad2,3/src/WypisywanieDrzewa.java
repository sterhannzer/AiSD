/**
 * Created by Łukasz on 2014-06-06.
 */
import java.util.*;
public class WypisywanieDrzewa {
    public Queue<Wierzcholek> kolejkaWierzcholkow;
    public ArrayList<Integer> wartosciWierzcholkow;

    public WypisywanieDrzewa(){

       // kolejkaWierzcholkow = new LinkedList<Wierzcholek>();
       // wartosciWierzcholkow = new ArrayList<Integer>();

    }
    public void drukowanieWierzcholkow(Drzewo drzewo){
        Stack globalStack = new Stack();
        globalStack.push(drzewo.getPierwszy());
        int emptyLeaf = 32;
        boolean isRowEmpty = false;
        while(isRowEmpty==false)
        {

            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<emptyLeaf; j++)
                System.out.print(' ');
            while(globalStack.isEmpty() == false)
            {
                Wierzcholek temp = (Wierzcholek) globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.getWartosc());
                    localStack.push(temp.getLewy());
                    localStack.push(temp.getPrawy());
                    if(temp.getLewy() != null || temp.getPrawy() != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<emptyLeaf*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            emptyLeaf /= 2;
            while(localStack.isEmpty() == false)
                globalStack.push( localStack.pop() );
        }

        /*kolejkaWierzcholkow.offer(drzewo.getPierwszy());
        wartosciWierzcholkow.add(drzewo.getPierwszy().getWartosc());

        while(kolejkaWierzcholkow.peek() != null){
            Wierzcholek pobrany = kolejkaWierzcholkow.poll();
            //System.out.print(pobrany.getWartosc());



            if(pobrany.getLewy() != null) {
                kolejkaWierzcholkow.offer(pobrany.getLewy());
                wartosciWierzcholkow.add(pobrany.getLewy().getWartosc());
            }
            else {
                wartosciWierzcholkow.add(null);
            }
            if(pobrany.getPrawy() != null) {
                kolejkaWierzcholkow.offer(pobrany.getPrawy());
                wartosciWierzcholkow.add(pobrany.getPrawy().getWartosc());
            }
            else {
                wartosciWierzcholkow.add(null);
            }
        }*/

    }
}



/*
    public void wypiszDrzewo(Drzewo drzewo){
        kolejkaWierzcholkow.add(new ArrayList<Wierzcholek>(Arrays.asList(drzewo.getPierwszy())));

        int glebokoscDrzewa = 1;
        for(ArrayList<Wierzcholek> listaWierzcholkow : kolejkaWierzcholkow){
            ArrayList<Wierzcholek> temp = new ArrayList<Wierzcholek>();
            ArrayList<Integer> wartosciWierzcholkow = new ArrayList<Integer>();
            for(Wierzcholek wierzcholek : listaWierzcholkow){
                if(wierzcholek == null){
                    wartosciWierzcholkow.add(null);
                    continue;
                }
                wartosciWierzcholkow.add(wierzcholek.getWartosc());
                if(wierzcholek.getLewy() == null){
                    temp.add(wierzcholek.getLewy());
                }
                else{
                    temp.add(wierzcholek.getLewy());
                    if(kolejkaWierzcholkow.indexOf(listaWierzcholkow)+1 == glebokoscDrzewa ){
                        glebokoscDrzewa += 1;

                    }
                }
                if(wierzcholek.getPrawy() == null){
                    temp.add(wierzcholek.getPrawy());
                }
                else{
                    temp.add(wierzcholek.getPrawy());
                    if(kolejkaWierzcholkow.indexOf(listaWierzcholkow)+1 == glebokoscDrzewa ){
                        glebokoscDrzewa += 1;

                    }
                }
            }
            wartosciWierzcholkowDrzewa.add(wartosciWierzcholkow);
            kolejkaWierzcholkow.add(temp);
            if(glebokoscDrzewa != kolejkaWierzcholkow.size()){
                break;
            }


        }
        System.out.println(" ");
    }
*/