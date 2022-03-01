package asisechytam;
public class Ucitel extends Clovek{
    int plat;
    
    /*
    public Ucitel(String jmeno, String prijmeni, int plat){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.plat = plat;
    }
    */
    
    public String toString(){
        String out = super.toStringAAA();
        out += "Plat:"+plat+"\n";
        return out;
    }
}
