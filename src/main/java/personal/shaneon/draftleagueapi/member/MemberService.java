package personal.shaneon.draftleagueapi.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getMembers() {
        List<Member> members = new ArrayList<>();
        memberRepository.findAll()
                .forEach(members::add);
        return members;
    }

    public Member getMember(String id) {
        return memberRepository.findById(id).get();
    }

    public void addMember(Member member) {
        memberRepository.save(member);
    }

    public void updateMember(Member member) {
        memberRepository.save(member);
    }

    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }
}
