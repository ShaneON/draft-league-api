package personal.shaneon.draftleagueapi.player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PlayerRepository extends CrudRepository<Player, String> {
}
