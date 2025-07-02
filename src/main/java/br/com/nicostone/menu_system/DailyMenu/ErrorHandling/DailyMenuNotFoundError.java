package br.com.nicostone.menu_system.DailyMenu.ErrorHandling;

import lombok.experimental.StandardException;

public class DailyMenuNotFoundError extends RuntimeException{
    public DailyMenuNotFoundError(String message) {
        super(message);
    }
}
