package personal.shaneon.draftleagueapi.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(method=RequestMethod.GET, value="/members")
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @RequestMapping(method=RequestMethod.GET, value="/members/{id}")
    public Member getMember(@PathVariable String id) {
        return memberService.getMember(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/members")
    public void addMember(@RequestBody Member member) {
        memberService.addMember(member);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/members/{id}")
    public void updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/members/{id}")
    public void deleteMember(@RequestBody Member member) {
        memberService.deleteMember(member);
    }
}
