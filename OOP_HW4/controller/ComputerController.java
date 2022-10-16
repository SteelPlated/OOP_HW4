package OOP_HW4.controller;

import OOP_HW4.data.Computer;
import OOP_HW4.data.Memory;
import OOP_HW4.service.ComputerService;

import java.util.List;
import java.util.Scanner;

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
            System.out.println("Ошибка ввода.");
            input.next();
            num = inputNumber(str);
        }
        return num;
    }

    public List<T> inputModel(List<T> list){
        String question = "У нас представлены модели Msi, Aser, Iru, Dell." +
                "\nНапишите название модели из списка выше.";
        String modelName = inputString(question);
        return computerService.filterModel(modelName, list);
    }

    public List<T> inputRAW(List<T> list){
        String question = "Сколько вы хотите оперативной памяти?\nSIXTEEN или FOUR Гб." +
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
