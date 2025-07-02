package br.com.nicostone.menu_system.StaffMember;

import br.com.nicostone.menu_system.StaffMember.DTO.StaffMemberDTO;
import br.com.nicostone.menu_system.StaffMember.DTO.StaffMemberNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMemberService {
    StaffMemberRepo staffRepo;

    StaffMemberService(StaffMemberRepo staffMemberRepo) {
        this.staffRepo = staffMemberRepo;
    }

    public StaffMemberModel addStaff(StaffMemberDTO staffDTO) {
        StaffMemberModel staffMod = new StaffMemberModel();
        staffMod.setEmail(staffDTO.getEmail());
        staffMod.setUsername(staffDTO.getUsername());
        staffMod.setPassword(staffDTO.getPassword());
        staffMod.setCargo(staffDTO.getCargo());

        return staffRepo.save(staffMod);
    }

    public List<StaffMemberModel> showStaff() {
        return staffRepo.findAll();
    }

    public StaffMemberModel findStaff(Long id) {
        return staffRepo.findById(id)
                .orElseThrow(() -> new StaffMemberNotFoundException("Staff member of id" + id + "hasn't been found"));
    }

    public StaffMemberModel updateStaffMember(Long id, StaffMemberDTO input_data) {
        StaffMemberModel staffMember = this.findStaff(id);

        if(input_data.getUsername() != null ){
            staffMember.setUsername(input_data.getUsername());
        }
        if(input_data.getEmail() != null ){
            staffMember.setEmail(input_data.getEmail());
        }
        if(input_data.getPassword() != null ){
            staffMember.setPassword(input_data.getPassword());
        }
        if(input_data.getCargo() != null ){
            staffMember.setCargo(input_data.getCargo());
        }

        return staffRepo.save(staffMember);
    }



    public void deleteStaffMember(Long id){
        staffRepo.deleteById(id);
    }
}
