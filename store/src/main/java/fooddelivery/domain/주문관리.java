package fooddelivery.domain;

import fooddelivery.domain.배달시작됨;
import fooddelivery.domain.배달시작됨;
import fooddelivery.domain.조리완료됨;
import fooddelivery.domain.쿠폰발행됨;
import fooddelivery.domain.쿠폰발행됨;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문관리_table")
@Data

public class 주문관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Boolean 조리시작여부;
    
    
    
    
    
    private Boolean 조리완료여부;
    
    
    
    
    
    private Boolean 배달시작여부;
    
    
    
    
    
    private Boolean 주문취소여부;

    @PostPersist
    public void onPostPersist(){


        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        조리완료됨 조리완료됨 = new 조리완료됨(this);
        조리완료됨.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();



        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static 주문관리Repository repository(){
        주문관리Repository 주문관리Repository = StoreApplication.applicationContext.getBean(주문관리Repository.class);
        return 주문관리Repository;
    }






}
