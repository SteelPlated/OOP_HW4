package OOPHW4.controller;

import java.util.List;
import java.util.Scanner;
import OOPHW4.data.Computer;
import OOPHW4.data.Memory;
import OOPHW4.service.ComputerService;

public class ComputerController<T extends Computer> {
    private final ComputerService<T> computerService;

    public ComputerController() {
        this.computerService = new ComputerService<>();
    }

    public String inputString(String str){
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        return input.nextLine();
    }

    public int inputNumber(String str){
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

    public List<T> inputModel(List<T> list){
        String question = "Представлены модели Msi, Aser, Iru, Dell." +
                "\nНапишите название модели из списка выше.";
        String modelName = inputString(question);
        return computerService.filterModel(modelName, list);
    }

    public List<T> inputRAW(List<T> list){
        String question = "Выберите обьем оперативной памяти\nSIXTEEN или FOUR Гб." +
                "\nНапишите значение из списка выше.";
        Memory raw = Memory.valueOf(inputString(question));
        return computerService.filterMemory(raw, list);
    }

    public List<T> inputSSD(List<T> list){
        String question = "Какой объем SSD вы хотите?\n128, 512 или 1024 Гб." +
                "\nНапишите значение из списка выше.";
        String ssd = inputString(question);
        return computerService.filterSSD(ssd, list);
    }


}
