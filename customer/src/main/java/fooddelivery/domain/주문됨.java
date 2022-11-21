package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 주문됨 extends AbstractEvent {

    private Long id;
    private String 품목;
    private Integer 수량;
}


