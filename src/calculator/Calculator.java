package calculator;

import operator.Operator;
import printer.FilePrinter;

import java.util.ArrayList;
import java.util.List;

public interface Calculator {

private FilePrinter fileprinter;
private Mathcalculator mathcalculator;
private Operator operator;

    private List<Operator> history;

    void calculate(double first, double second, Operator operator);


   public Calculator() {
       this.history = new ArrayList<>();

