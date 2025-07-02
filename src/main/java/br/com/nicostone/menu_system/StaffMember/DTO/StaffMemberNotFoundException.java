package br.com.nicostone.menu_system.StaffMember.DTO;

public class StaffMemberNotFoundException extends RuntimeException {
    public StaffMemberNotFoundException(String message){
        super(message);
    }
}
