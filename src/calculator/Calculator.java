/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Daffodi PC
 */
public class Calculator {

    public int add(int... n) {
        int sum = 0;
        for (int x : n) {
            sum += x;
        }
        return sum;
    }
}
