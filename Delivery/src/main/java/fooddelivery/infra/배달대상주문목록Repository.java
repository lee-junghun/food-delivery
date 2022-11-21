package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="배달대상주문목록", path="배달대상주문목록")
public interface 배달대상주문목록Repository extends PagingAndSortingRepository<배달대상주문목록, Long> {

    

    
}
