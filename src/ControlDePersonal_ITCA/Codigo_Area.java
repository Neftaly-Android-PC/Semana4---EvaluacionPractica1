
package ControlDePersonal_ITCA;

public class Codigo_Area {
    String computos;
    String BibliotecaW;
    String Zona_Verde;
    String Labo,Cancha;
    
    public Codigo_Area(){
        
    }

    public Codigo_Area(String computos, String BibliotecaW, String Zona_Verde, String Labo, String Cancha) {
        this.computos = computos;
        this.BibliotecaW = BibliotecaW;
        this.Zona_Verde = Zona_Verde;
        this.Labo = Labo;
        this.Cancha = Cancha;
    }

    public String getComputos() {
        return computos;
    }

    public void setComputos(String computos) {
        this.computos = computos;
    }

    public String getBibliotecaW() {
        return BibliotecaW;
    }

    public void setBibliotecaW(String BibliotecaW) {
        this.BibliotecaW = BibliotecaW;
    }

    public String getZona_Verde() {
        return Zona_Verde;
    }

    public void setZona_Verde(String Zona_Verde) {
        this.Zona_Verde = Zona_Verde;
    }

    public String getLabo() {
        return Labo;
    }

    public void setLabo(String Labo) {
        this.Labo = Labo;
    }

    public String getCancha() {
        return Cancha;
    }

    public void setCancha(String Cancha) {
        this.Cancha = Cancha;
    }

    
}




