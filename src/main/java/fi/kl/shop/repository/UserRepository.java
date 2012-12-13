package fi.kl.shop.repository;

import fi.kl.shop.domain.User;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = User.class)
public interface UserRepository {

    List<fi.kl.shop.domain.User> findAll();
}
