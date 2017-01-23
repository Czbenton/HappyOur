package Services;

import com.zach.Entities.Location;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zach on 1/23/17.
 */
public interface LocationRepo extends CrudRepository<Location, Integer> {
    
}
