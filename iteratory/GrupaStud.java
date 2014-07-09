public class GrupaStud
{
    public static void main(){
        Student [] s = new Student[5];
        s[0]=new Student(1,0);
        s[1]=new Student(2,400);
        s[2]=new Student(3,0);
        s[3]=new Student(4,500);
        s[4]=new Student(5,700);
        IteratorTablicowy itab = new IteratorTablicowy(s);
        IteratorOdwrotny itabRev = new IteratorOdwrotny(itab);
        StudentBezStypendium studBezStyp = new StudentBezStypendium();
        StudentZeStypendium studZeStyp = new StudentZeStypendium();
        IteratorFiltrujacy itabF = new IteratorFiltrujacy(itab,studZeStyp);
        IteratorFiltrujacy itabNotF = new IteratorFiltrujacy(itab,studBezStyp);
        IteratorFiltrujacy itabFRev = new IteratorFiltrujacy(itabRev,studZeStyp);
        IteratorFiltrujacy itabNotFRev = new IteratorFiltrujacy(itabRev,studBezStyp);

        System.out.println("Pe³na lista studentów:");
        // zamiast: wyswietlWykazStudentow(itab);
        // instrukcje realizuj¹ce to samo z iteratorem "itab":
            System.out.println("     NrInd  Stypendium");
            for (itab.first(); !itab.isDone(); itab.next()) {
                 Student st = (Student) itab.current();
                 st.wyswietlDane();
            }
                        
        System.out.println("Pe³na lista studentów - porz¹dek odwrotny:");
        // zamiast: wyswietlWykazStudentow(itabRev);
        // instrukcje realizuj¹ce to samo z iteratorem "itabRev":
            System.out.println("     NrInd  Stypendium");
            for (itabRev.first(); !itabRev.isDone(); itabRev.next()) {
                 Student st = (Student) itabRev.current();
                 st.wyswietlDane();
            }
        
        System.out.println("Lista studentow otrzymujacych stypendium:");
        // zamiast: wyswietlWykazStudentow(itabF);
        // to:
            System.out.println("     NrInd  Stypendium");
            for (itabF.first(); !itabF.isDone(); itabF.next()) {
                 Student st = (Student) itabF.current();
                 st.wyswietlDane();
            }

        System.out.println("Lista studentow nie otrzymujacych stypendium:");
        // zamiast: wyswietlWykazStudentow(itabNotF);
        // to:
            System.out.println("     NrInd  Stypendium");
            for (itabNotF.first(); !itabNotF.isDone(); itabNotF.next()) {
                 Student st = (Student) itabNotF.current();
                 st.wyswietlDane();
            }

        System.out.println("Lista studentow otrzymujacych stypendium - porz¹dek odwrotny:");
        // zamiast: wyswietlWykazStudentow(itabFRev);
        // to:
            System.out.println("     NrInd  Stypendium");
            for (itabFRev.first(); !itabFRev.isDone(); itabFRev.next()) {
                 Student st = (Student) itabFRev.current();
                 st.wyswietlDane();
            }

        System.out.println("Lista studentow nie otrzymujacych stypendium - porz¹dek odwrotny:");
        // zamiast: wyswietlWykazStudentow(itabNotFRev);
        // instrukcje realizujace to samo z iteratorem "itabNotFRev":
            System.out.println("     NrInd  Stypendium");
            for (itabNotFRev.first(); !itabNotFRev.isDone(); itabNotFRev.next()) {
                 Student st = (Student) itabNotFRev.current();
                 st.wyswietlDane();
            }
        
        // zamiast: podwyzkaStypendium(itabF,50);
        // instrukcje realizujace to samo z iteratorem "itabF":
          for (itabF.first(); !itabF.isDone(); itabF.next()){
             Student st = (Student) itabF.current();
             st.zwiekszStypendium(50);
          }
        System.out.println("Lista studentow otrzymujacych stypendium - po podwy¿ce stypendium:");
        // zamiast: wyswietlWykazStudentow(itabF);
        // to:
            System.out.println("     NrInd  Stypendium");
            for (itabF.first(); !itabF.isDone(); itabF.next()) {
                 Student st = (Student) itabF.current();
                 st.wyswietlDane();
            }
        System.out.println("Pe³na lista studentów:");
        // zamiast: wyswietlWykazStudentow(itab);
        // instrukcje realizuj¹ce to samo z iteratorem "itab":
            System.out.println("     NrInd  Stypendium");
            for (itab.first(); !itab.isDone(); itab.next()) {
                 Student st = (Student) itab.current();
                 st.wyswietlDane();
            }
    }
}