package pac.services;

import org.bson.types.ObjectId;
import pac.models.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    User findOneById(ObjectId id);
    List<User> findByIdIn(List<String>ids);
}
