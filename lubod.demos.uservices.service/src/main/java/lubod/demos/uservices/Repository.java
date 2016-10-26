package lubod.demos.uservices;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Repository extends CrudRepository<Something, Long> {
    @Query("select b from Something b order by RAND()")
    List<Something> getRandomOrder();
}
