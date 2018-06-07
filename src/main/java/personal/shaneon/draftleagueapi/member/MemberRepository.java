package personal.shaneon.draftleagueapi.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MemberRepository extends CrudRepository<Member, Integer> {
}
