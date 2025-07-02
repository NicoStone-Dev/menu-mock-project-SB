package br.com.nicostone.menu_system.StaffMember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMemberRepo extends JpaRepository<StaffMemberModel, Long> {

}
