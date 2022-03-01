package asisechytam;
public class Student extends Clovek{
    int znamka;
    
    /*
    public Student(String jmeno, String prijmeni, int znamka){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.znamka = znamka;
    }
    */

    public String toString(){
        String out = super.toStringAAA();
        out += "Známka:"+znamka+"\n";
        return out;
    }
    
}
