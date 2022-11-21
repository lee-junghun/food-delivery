package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="배달관리", path="배달관리")
public interface 배달관리Repository extends PagingAndSortingRepository<배달관리, Long>{

}
