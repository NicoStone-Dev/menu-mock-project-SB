package br.com.nicostone.menu_system.DailyMenu;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MenuHistory")
public class DailyMenuModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private LocalDate date;

    //Cardápio Almoço
    @Column(nullable = false)
    private ArrayList<String> acompanAlmoco;
    private ArrayList<String> opcaoVegAlmoco;
    private ArrayList<String> opcaoCarnAlmoco;
    private String saladaAlmoco;
    private ArrayList<String> bebidasAlmoco;
    @Column(length = 500)
    private String obsAlmoco;

    //Cardápio Regional
    @Column(nullable = false)
    private ArrayList<String> acompanJanta;
    private ArrayList<String> opcaoVegJanta;
    private ArrayList<String> opcaoCarnJanta;
    private ArrayList<String> bebidasJanta;
    private String opcaoEnsopado;
    @Column(length = 500)
    private String obsJanta;
}

