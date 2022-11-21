package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="배달대상주문목록_table")
@Data
public class 배달대상주문목록 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}