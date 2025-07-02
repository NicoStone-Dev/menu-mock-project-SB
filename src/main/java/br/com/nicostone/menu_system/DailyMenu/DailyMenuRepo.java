package br.com.nicostone.menu_system.DailyMenu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyMenuRepo extends JpaRepository<DailyMenuModel, Long> {
}
