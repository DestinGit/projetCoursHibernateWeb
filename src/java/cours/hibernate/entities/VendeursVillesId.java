package cours.hibernate.entities;
// Generated 19 oct. 2017 12:11:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VendeursVillesId generated by hbm2java
 */
public class VendeursVillesId  implements java.io.Serializable {


     private int idVendeur;
     private String cp;
     private Date dateDebut;

    public VendeursVillesId() {
    }

    public VendeursVillesId(int idVendeur, String cp, Date dateDebut) {
       this.idVendeur = idVendeur;
       this.cp = cp;
       this.dateDebut = dateDebut;
    }
   
    public int getIdVendeur() {
        return this.idVendeur;
    }
    
    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public Date getDateDebut() {
        return this.dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VendeursVillesId) ) return false;
		 VendeursVillesId castOther = ( VendeursVillesId ) other; 
         
		 return (this.getIdVendeur()==castOther.getIdVendeur())
 && ( (this.getCp()==castOther.getCp()) || ( this.getCp()!=null && castOther.getCp()!=null && this.getCp().equals(castOther.getCp()) ) )
 && ( (this.getDateDebut()==castOther.getDateDebut()) || ( this.getDateDebut()!=null && castOther.getDateDebut()!=null && this.getDateDebut().equals(castOther.getDateDebut()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVendeur();
         result = 37 * result + ( getCp() == null ? 0 : this.getCp().hashCode() );
         result = 37 * result + ( getDateDebut() == null ? 0 : this.getDateDebut().hashCode() );
         return result;
   }   


}


