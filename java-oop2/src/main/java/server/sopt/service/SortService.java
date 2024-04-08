package server.sopt.service;

import server.sopt.logic.JavaSort;
import server.sopt.logic.Sort;

import java.util.List;


public class SortService {
    private Sort<String> sort;
    public SortService(Sort<String> sort) {
        this.sort = sort;
    }
    public List<String> dosort(List<String> list) {
        return sort.sort(list);
    }
}
