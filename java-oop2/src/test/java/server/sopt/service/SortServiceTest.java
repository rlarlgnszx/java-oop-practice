package server.sopt.service;

import org.junit.jupiter.api.Test;
import server.sopt.logic.JavaSort;
import server.sopt.logic.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sortService = new SortService(new JavaSort<String>());
    @Test
    void tesT() {
        //Given
        //When
        List<String> act = sortService.dosort(List.of("3", "2", "1"));
        //Then
        assertEquals(List.of("1", "2", "3"), act);
    }

}