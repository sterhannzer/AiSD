public class GrupaStud{
	public static void main(String args[]){
        Student [] s = new Student[5];
        zamianaMiejsca obiekt = new zamianaMiejsca();
       
        ZmianaOceny nowaOcena = new ZmianaOceny();
        OperacjeNaOcenach sredniaOcen = new OperacjeNaOcenach();
         
        s[0]=new Student(1,0,2);
        s[1]=new Student(2,400,1);
        s[2]=new Student(3,0,4);
        s[3]=new Student(4,500,5);
        s[4]=new Student(5,700,5);
        
        obiekt.wyswietlWszystkich(s);
        
        obiekt.usuwanieStud(s, obiekt.wskazStudenta(s, 3));
        
        obiekt.dodajStudenta(s, obiekt.zwrocWolneMiejsce(s), 9, 2, 400 );
        nowaOcena.zmiana(s, 4, 4);  // (listaStudentów, indeks, nowaOcena)
        obiekt.sortuj(s);
        
        
        obiekt.wyswietlWszystkich(s);
        
        System.out.println(sredniaOcen.LiczSrednia(s));
        System.out.println("");
        System.out.println("Nie zaliczyli:");
        sredniaOcen.nieZaliczyli(s);
        
        //obiekt.dodajStudenta(s, obiekt.zwrocWolneMiejsce(s), 9, 5, 400 );
             
        //obiekt.usuwanieStud(s, obiekt.wskazStudenta(s, 9));
       
        //obiekt.dodajStudenta(s, obiekt.zwrocWolneMiejsce(s), 10, 5, 400 );
     
	}    
    
}	
