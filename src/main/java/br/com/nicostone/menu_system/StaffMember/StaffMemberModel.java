package br.com.nicostone.menu_system.StaffMember;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Staff")
public class StaffMemberModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String username;
    private String email;
    @Column(nullable = false)
    private String cargo;
    @Column(nullable = false, unique = false)
    private String password;
}
