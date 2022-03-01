package asisechytam;
public class AsiSeChytam {
    public static void main(String[] args) {
    Ucitel u = new Ucitel();
    u.jmeno = "Jan";
    u.prijmeni = "Komenský";
    u.plat = 100;
    
    Student s = new Student();
    s.jmeno = "Sabina";
    s.prijmeni = "Javůrková";
    s.znamka = 2;
    
    System.out.println(u);
    System.out.println(s);
    }
    
}
