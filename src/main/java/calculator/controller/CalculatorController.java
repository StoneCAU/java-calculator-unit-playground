package calculator.controller;

import calculator.domain.Calculator;
import view.InputView;

import static view.OutputView.*;

public class CalculatorController {
    public static void start() {
        final int firstOperation;
        final int secondOperation;
        final char operation;

        PrintMessage(ASK_FIRST_OPERATION_MESSAGE);
        firstOperation = InputView.InputOperation();

        PrintMessage(ASK_OPERATOR_MESSAGE);
        operation = InputView.InputOperator();

        PrintMessage(ASK_TWICE_OPERATION_MESSAGE);
        secondOperation = InputView.InputOperation();

        calculate(firstOperation, secondOperation, operation);
    }

    private static void calculate(int firstOperation, int secondOperation, char operation) {
        Calculator calculator = new Calculator();
        int result;

        if (operation == '+') {
            result = calculator.add(firstOperation, secondOperation);
        }
        else if (operation == '-') {
            result = calculator.subtract(firstOperation, secondOperation);
        }
        else if (operation == '*') {
            result = calculator.multiply(firstOperation, secondOperation);
        }
        else if (operation == '/') {
            result = calculator.divide(firstOperation, secondOperation);
        }
        else throw new RuntimeException("Invalid operation");

        PrintResult(result);
    }


}
