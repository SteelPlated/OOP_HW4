package OOPHW4.controller.impl;

import java.util.List;

import OOPHW4.controller.ComputerController;
import OOPHW4.data.impl.Desktop;
import OOPHW4.service.impl.DesktopService;

public class DesktopController extends ComputerController<Desktop> {
    private final DesktopService desktopService;

    public DesktopController() {
        this.desktopService = new DesktopService();
    }

    public void printDesktop(List<Desktop> desktops){
        desktopService.print(desktops);
    }
    public List<Desktop> desktopList(){
        return desktopService.desktopList();
    }
    public List<Desktop> inputPowerSupply(List<Desktop> list){
        String question = "Выберите блок питания по мощности 350, 650, 800." +
                "\nНапишите значение из списка выше.";
        int powerSupply = inputNumber(question);
        return desktopService.filterPowerSupply(powerSupply, list);
    }

}
