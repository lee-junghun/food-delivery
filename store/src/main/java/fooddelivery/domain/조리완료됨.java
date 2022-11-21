package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 조리완료됨 extends AbstractEvent {

    private Long id;

    public 조리완료됨(주문관리 aggregate){
        super(aggregate);
    }
    public 조리완료됨(){
        super();
    }
}
