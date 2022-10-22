package OOPHW4.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.Scanner;
import OOPHW4.data.Memory;
import OOPHW4.data.impl.Desktop;
import OOPHW4.service.ComputerService;
import OOPHW4.service.Printable;
import OOPHW4.service.impl.DesktopService;

public class DesktopService extends ComputerService<Desktop> implements Printable<Desktop> {


    public void printDesktop(List<Desktop> list){
        print(list);
    }
    public List<Desktop> inputPowerSupply(List<Desktop> list){
        String question = "Выберите блок питания по мощности 350, 650, 800." +
                "\nНапишите значение из списка выше.";
        int powerSupply = inputNumber(question);
        return filterPowerSupply(powerSupply, list);
    }
    public String inputString(String str){
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        return input.nextLine();
    }
    public int inputNumber(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        int num;
        if (input.hasNextInt()) {
            num = input.nextInt();
        } else {
            System.out.println("Ошибка");
            input.next();
            num = inputNumber(str);
        }
        return num;
    }

    @Override
    public void print(List<Desktop> list) {
        Logger logger = Logger.getAnonymousLogger();
        for (Desktop i: list) {
            logger.info(i.toString());
        }
    }

    public List<Desktop> filterPowerSupply(int powerSupply, List<Desktop> list){
        for (int i = 0; i < list.size(); i++) {
            if (powerSupply != list.get(i).getPowerSupply()){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public List<Desktop> desktopList(){
        List<Desktop> desktops = new ArrayList<>();
        desktops.add(new Desktop("75", "Msi", Memory.SIXTEEN, "512", 650));
        desktops.add(new Desktop("23", "Aser", Memory.FOUR, "128", 350));
        desktops.add(new Desktop("87", "Iru", Memory.FOUR, "1024", 800));
        desktops.add(new Desktop("12", "Dell", Memory.SIXTEEN, "512", 350));
        desktops.add(new Desktop("2", "Iru", Memory.FOUR, "1024", 650));
        return desktops;
    }

    public List<Desktop> inputModel(List<Desktop> desktops) {
        String question = "Представлены модели Msi, Aser, Iru, Dell." +
        "\nНапишите название модели из списка выше.";
        String modelName = inputString(question);
        for (int i = 0; i < desktops.size(); i++) {
            if (!modelName.equals(desktops.get(i).getModel())){
                desktops.remove(i);
                i--;
            }
        }
        return desktops;
    }

    public List<Desktop> inputRAW(List<Desktop> desktops) {
        String question = "Выберите обьем оперативной памяти\nSIXTEEN или FOUR Гб." +
                "\nНапишите значение из списка выше.";
        Memory raw = Memory.valueOf(inputString(question));
        for (int i = 0; i < desktops.size(); i++) {
            if (!raw.equals(desktops.get(i).getMemory())){
                desktops.remove(i);
                i--;
            }
        }
        return desktops;
    }

    public List<Desktop> inputSSD(List<Desktop> desktops) {
        String question = "Какой объем SSD вы хотите?\n128, 512 или 1024 Гб." +
                "\nНапишите значение из списка выше.";
        String ssd = inputString(question);
        for (int i = 0; i < desktops.size(); i++) {
            if (!ssd.equals(desktops.get(i).getSsd())){
                desktops.remove(i);
                i--;
            }
        }
        return desktops;
    }



}



    
