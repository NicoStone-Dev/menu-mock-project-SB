package br.com.nicostone.menu_system.DailyMenu.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {

    @Nullable
    private LocalDate date;
    @Nullable
    private ArrayList<String> acompanAlmoco;
    @Nullable
    private ArrayList<String> opcaoVegAlmoco;
    @Nullable
    private ArrayList<String> opcaoCarnAlmoco;
    @Nullable
    private String saladaAlmoco;
    @Nullable
    private ArrayList<String> bebidasAlmoco;
    @Column(length = 500)
    @Nullable
    private String obsAlmoco;
    @Nullable
    private ArrayList<String> acompanJanta;
    @Nullable
    private ArrayList<String> opcaoVegJanta;
    @Nullable
    private ArrayList<String> opcaoCarnJanta;
    @Nullable
    private ArrayList<String> bebidasJanta;
    @Nullable
    private String opcaoEnsopado;
    @Nullable
    private String obsJanta;
}
