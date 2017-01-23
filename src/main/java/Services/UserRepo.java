package Services;

import com.zach.Entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zach on 1/23/17.
 */
public interface UserRepo extends CrudRepository<User, Integer> {
    User findFirstByName(String userName);
}