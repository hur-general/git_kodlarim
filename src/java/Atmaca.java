

import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@Dependent
@ManagedBean(name = "atmaca" ,eager = true)
@RequestScoped
public class Atmaca {
    private String kalkisYeri,varisyeri,saat ;
    private String sifre ;
     private String isim ;
      private String soyİsim ;
       private String email ;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSoyİsim() {
        return soyİsim;
    }

    public void setSoyİsim(String soyİsim) {
        this.soyİsim = soyİsim;
    }
     
    

    public void setKalkisYeri(String kalkisYeri) {
        this.kalkisYeri = kalkisYeri;
    }

    public void setVarisyeri(String varisyeri) {
        this.varisyeri = varisyeri;
    }

    public String getKalkisYeri() {
        return kalkisYeri;
    }

    public String getVarisyeri() {
        return varisyeri;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
    
    
    
    public String action()
            {  
               
              
                return "/uyeol.xhtml";
            }
      
            
    
    
    
    public String[] saatler;
    public String[] iller;

    public String[] getIller() {
        iller=new String[4];
                iller[0]="istanbul";
                iller[1]="Ankara";
                iller[2]="izmir";
                iller[3]="Bursa";
        return iller;
    }

    public String[] getSaatler() {
            saatler=new String[3];
            saatler[0]="11.00";
            saatler[1]="15.00";
            saatler[2]="19.00";
        return saatler;
    }

    
    
    
    
    
    
}
