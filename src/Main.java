package main;

import calculator.MathCalculator;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static <MathCalculator> void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        MathCalculator mathCalculator = new MathCalculator(filePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner);

        BufferedWriter bufferedWriter = new BufferedWriter();
        FileWriter fileWriter = new FileWriter();
        FileReader fileReader = new FileReader();

        stringParser.parse();

        scanner.close();
    }
}

//1. Скачать текущий проект с занятия
//2. Добавить возможность хранить историю всех операций
//2.1. История должна представлять собой список из объектов. Эти объекты хранят информацию о конкретной операции. Тип объекта, его поля выбирайте самостоятельно
//2.2. Проассоциировать получившийся интерфейс (и или класс) с каким-либо другим классам этого проекта, для того, что история заработала
//
//4*. Реализовать класс FilePrinter и дать возможность пользователю при запуске приложения выбирать, куда вывести ответ - в файл или в консоль
