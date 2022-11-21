package fooddelivery.domain;

import fooddelivery.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="배달관리_table")
@Data

public class 배달관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static 배달관리Repository repository(){
        배달관리Repository 배달관리Repository = DeliveryApplication.applicationContext.getBean(배달관리Repository.class);
        return 배달관리Repository;
    }






}
