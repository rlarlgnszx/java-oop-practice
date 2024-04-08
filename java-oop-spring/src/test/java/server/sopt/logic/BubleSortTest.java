package server.sopt.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubleSortTest {
    @DisplayName("리스트 넣으면 정렬ㄱ된 결과 반환 ")
    @Test
    void test(){
        BubleSort<Integer> bubleSort = new BubleSort<>();

        List<Integer> artucal = bubleSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1, 2, 3, 4, 5), artucal);
    }
}