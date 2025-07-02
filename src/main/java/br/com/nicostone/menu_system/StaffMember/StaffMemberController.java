package br.com.nicostone.menu_system.StaffMember;

import br.com.nicostone.menu_system.StaffMember.DTO.StaffMemberDTO;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffmember")
public class StaffMemberController {
    StaffMemberService staffMemberService;

    StaffMemberController(StaffMemberService sms) {
        this.staffMemberService = sms;
    }

    @PostMapping("/create")
    public ResponseEntity<StaffMemberModel> addStaff(@RequestBody StaffMemberDTO staff) {
        return new ResponseEntity<>(staffMemberService.addStaff(staff), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<StaffMemberModel>> staffList() {
        return new ResponseEntity<>(staffMemberService.showStaff(), HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<StaffMemberModel> findStaff(@PathVariable Long id){
        return new ResponseEntity<>(staffMemberService.findStaff(id), HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<StaffMemberModel> update(@PathVariable("id") Long id, @RequestBody StaffMemberDTO staff){
        return new ResponseEntity<>(staffMemberService.updateStaffMember(id, staff), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        staffMemberService.deleteStaffMember(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
