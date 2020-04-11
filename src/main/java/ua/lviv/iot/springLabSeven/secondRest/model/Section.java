package ua.lviv.iot.springLabSeven.secondRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    protected Integer id;
    protected String name;
    protected Integer detergentType;
    
    
    public Section() {
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getDetergentType() {
        return detergentType;
    }
    public void setDetergentType(Integer detergentType) {
        this.detergentType = detergentType;
    }
    
    

}
