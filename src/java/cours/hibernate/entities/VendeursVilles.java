package cours.hibernate.entities;
// Generated 19 oct. 2017 12:11:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VendeursVilles generated by hbm2java
 */
public class VendeursVilles  implements java.io.Serializable {


     private VendeursVillesId id;
     private Vendeurs vendeurs;
     private Villes villes;
     private Date dateFin;

    public VendeursVilles() {
    }

    public VendeursVilles(VendeursVillesId id, Vendeurs vendeurs, Villes villes, Date dateFin) {
       this.id = id;
       this.vendeurs = vendeurs;
       this.villes = villes;
       this.dateFin = dateFin;
    }
   
    public VendeursVillesId getId() {
        return this.id;
    }
    
    public void setId(VendeursVillesId id) {
        this.id = id;
    }
    public Vendeurs getVendeurs() {
        return this.vendeurs;
    }
    
    public void setVendeurs(Vendeurs vendeurs) {
        this.vendeurs = vendeurs;
    }
    public Villes getVilles() {
        return this.villes;
    }
    
    public void setVilles(Villes villes) {
        this.villes = villes;
    }
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }




}


