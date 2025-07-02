package br.com.nicostone.menu_system.User.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO{
    @Nullable
    private String email;
    @Nullable
    private Boolean notifyAlmoco;
    @Nullable
    private Boolean notifyJanta;
}
