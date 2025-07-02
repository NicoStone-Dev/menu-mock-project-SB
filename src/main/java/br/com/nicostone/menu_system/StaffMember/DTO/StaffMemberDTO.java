package br.com.nicostone.menu_system.StaffMember.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffMemberDTO implements Serializable {
    @Nullable
    private String username;
    @Nullable
    private String email;
    @Nullable
    private String password;
    @Nullable
    private String cargo;
}
