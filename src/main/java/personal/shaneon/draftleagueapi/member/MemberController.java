package personal.shaneon.draftleagueapi.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/members")
    public List<Member> getMembers(HttpServletResponse response) {
        response.setHeader("Content-Type", "application/vnd.api+json");
        return memberService.getMembers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/members/{id}")
    public Member getMember(@PathVariable Integer id, HttpServletResponse response) {
        response.setHeader("Content-Type", "application/vnd.api+json");
        return memberService.getMember(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.POST, value="/members")
    public void addMember(@RequestBody Member member) {
        memberService.addMember(member);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.PUT, value="/members/{id}")
    public void updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.DELETE, value="/members/{id}")
    public void deleteMember(@RequestBody Member member) {
        memberService.deleteMember(member);
    }
}
