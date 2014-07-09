import java.util.Comparator;

public class Student {	
	int nrIndeksu;
	double stypendium;
	double Ocena;

	
	public Student(int numer, double kwota, double ocena){
		this.nrIndeksu=numer;
		this.stypendium=kwota; 
		this.Ocena=ocena;
	}
  
	
    public void zmienOcene(double ocena){
	    Ocena=ocena;
    }
  
    
    public void zwiekszStypendium(double kwota){
        stypendium+=kwota;
    }
    
    
    public void wyswietlDane(){
        System.out.printf("     %3d  %1.1f   %8.2f z³\n",nrIndeksu,Ocena,stypendium);
    }
   
    
    public int wyswietlNumer(){
	    return nrIndeksu;
    }
   

    public double wyswietlOcene(){
	    return Ocena;
    }
   
   
    public static Comparator<Student> OcenaComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return (int) (o2.wyswietlOcene() - o1.wyswietlOcene());
		}
	};
	
	
}


