package filrouge.jeu.bean;
// Generated 3 mai 2018 10:02:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ressources generated by hbm2java
 */
@Entity
@Table(name="ressources")
public class Ressources  implements java.io.Serializable {


     private Integer id;
     

     /*
      * libebelle est un titre utiliser dans le jeux
      */
     private String libebelle;
     
     /*
      * typeRessource est une énumaration des resource pour gérée le code
      * libebelle est typeRessource sont les méme chose
      */
     private int typeRessource;
     private Set<RelationRessource> relationRessources = new HashSet<RelationRessource>(0);

    public Ressources() {
    }

	
    public Ressources(String libebelle, int typeRessource) {
        this.libebelle = libebelle;
        this.typeRessource = typeRessource;
    }
    
    public Ressources(String libebelle, int typeRessource, Set<RelationRessource> relationRessources) {
       this.libebelle = libebelle;
       this.typeRessource = typeRessource;
       this.relationRessources = relationRessources;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
     
     public void setId(int id) {
         this.id = new Integer( id);
     }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="LIBEBELLE", nullable=false, length=50)
    public String getLibebelle() {
        return this.libebelle;
    }
    
    public void setLibebelle(String libebelle) {
        this.libebelle = libebelle;
    }

    
    @Column(name="TYPE_RESSOURCE", nullable=false)
    public int getTypeRessource() {
        return this.typeRessource;
    }
    
    public void setTypeRessource(int typeRessource) {
        this.typeRessource = typeRessource;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ressources")
    public Set<RelationRessource> getRelationRessources() {
        return this.relationRessources;
    }
    
    public void setRelationRessources(Set<RelationRessource> relationRessources) {
        this.relationRessources = relationRessources;
    }




}


