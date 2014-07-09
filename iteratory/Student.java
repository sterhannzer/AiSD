public class Student
{
  int nrIndeksu;
  double stypendium;
  
  public Student(int numer, double kwota){
     nrIndeksu=numer;
     stypendium=kwota;    
    }
   public void zwiekszStypendium(double kwota){
       stypendium+=kwota;
    }
   public void wyswietlDane(){
       System.out.printf("     %3d   %8.2f z³\n",nrIndeksu,stypendium);
    }
 }