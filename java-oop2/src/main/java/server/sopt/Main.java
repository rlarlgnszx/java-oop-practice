package server.sopt;

import server.sopt.logic.BubleSort;
import server.sopt.logic.JavaSort;
import server.sopt.logic.Sort;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("Hello world!");
    }
}