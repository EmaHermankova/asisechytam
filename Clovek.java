package asisechytam;
public class Clovek {
    String jmeno;
    String prijmeni;
    
    /*
    public Clovek(String j, String p) {
    jmeno = j;
    prijmeni = p;
    }
    */
    
    public String toStringAAA(){
        String out;
        out = "Jméno:"+jmeno+"\n";
        out += "Příjmení:"+prijmeni+"\n";
        return out;
    }
}

