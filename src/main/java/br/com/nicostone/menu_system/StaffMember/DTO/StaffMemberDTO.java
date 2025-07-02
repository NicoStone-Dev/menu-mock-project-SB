package br.com.nicostone.menu_system.StaffMember.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffMemberDTO implements Serializable {
    @NonNull
    private String username;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private String cargo;
}
