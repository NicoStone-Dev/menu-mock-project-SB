package br.com.nicostone.menu_system.DailyMenu;

import br.com.nicostone.menu_system.DailyMenu.DTO.MenuDTO;
import br.com.nicostone.menu_system.DailyMenu.ErrorHandling.DailyMenuNotFoundError;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyMenuService {
    DailyMenuRepo menuRepo;

    public DailyMenuService(DailyMenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    public DailyMenuModel addDailyMenu(DailyMenuModel dailyMenuModel) {
        return menuRepo.save(dailyMenuModel);
    }

    public List<DailyMenuModel> menuList(){
        return menuRepo.findAll();
    }

    public DailyMenuModel findMenu(Long id){
        DailyMenuModel dailyMenuModel = menuRepo.findById(id).orElseThrow(
                () -> new DailyMenuNotFoundError("Menu with id " + id + " not found")
        );

        return menuRepo.save(dailyMenuModel);
    }

    public DailyMenuModel updateAlmoco(MenuDTO input_data, Long menu_id){
        DailyMenuModel menu = findMenu(menu_id);

        if(input_data.getAcompanAlmoco() != null){
            menu.setAcompanAlmoco(input_data.getAcompanAlmoco());
        }
        if(input_data.getOpcaoVegAlmoco() != null){
            menu.setOpcaoVegAlmoco(input_data.getOpcaoVegAlmoco());
        }
        if(input_data.getOpcaoCarnAlmoco() != null){
            menu.setOpcaoCarnAlmoco(input_data.getOpcaoCarnAlmoco());
        }
        if(input_data.getSaladaAlmoco() != null){
            menu.setSaladaAlmoco(input_data.getSaladaAlmoco());
        }
        if(input_data.getBebidasAlmoco() != null){
            menu.setBebidasAlmoco(input_data.getBebidasAlmoco());
        }
        if(input_data.getObsAlmoco() != null){
            menu.setObsAlmoco(input_data.getObsAlmoco());
        }

        return menuRepo.save(menu);
    }

    public DailyMenuModel updateJanta(MenuDTO input_data, Long menu_id){
        DailyMenuModel menu = findMenu(menu_id);

        if (input_data.getAcompanJanta() != null){
            menu.setAcompanJanta(input_data.getAcompanJanta());
        }
        if (input_data.getOpcaoVegJanta() != null){
            menu.setOpcaoVegJanta(input_data.getOpcaoVegJanta());
        }
        if(input_data.getOpcaoCarnJanta() != null){
            menu.setOpcaoCarnJanta(input_data.getOpcaoCarnJanta());
        }
        if(input_data.getBebidasJanta() != null){
            menu.setBebidasJanta(input_data.getBebidasJanta());
        }
        if(input_data.getOpcaoEnsopado() != null){
            menu.setOpcaoEnsopado(input_data.getOpcaoEnsopado());
        }
        if (input_data.getObsJanta() != null){
            menu.setObsJanta(input_data.getObsJanta());
        }

        return menuRepo.save(menu);
    }

    public DailyMenuModel deleteMenu(Long id){
        DailyMenuModel dailyMenuModel = findMenu(id);
        menuRepo.delete(dailyMenuModel);
        return  dailyMenuModel;
    }
}
