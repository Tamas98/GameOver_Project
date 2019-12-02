package Database;

import util.jpa.GenericJpaDao;

public class UserDAO extends GenericJpaDao {

    public UserDAO() {
        super(User.class);
    }
}
