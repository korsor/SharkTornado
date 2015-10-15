package th.ac.kmitl.ce.ooad;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Nut on 10/16/2015.
 */
public interface AccountRepository extends MongoRepository<Account, String> {
    public Account findByUserId(String userId);
    public Account findByUsername(String username);
}