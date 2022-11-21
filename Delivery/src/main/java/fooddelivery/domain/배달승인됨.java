package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배달승인됨 extends AbstractEvent {

    private Long id;

    public 배달승인됨(){
        super();
    }
}
