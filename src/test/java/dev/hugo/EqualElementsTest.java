package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class EqualElementsTest {

    @Test
    public void testFindDuplicates() {
        int[] array1 = {1, 2, 3, 3, 4, 4, 5, 2};
        int[] array2 = {1, 1, 1, 2, 2, 3, 3, 4};
        int[] array3 = {1, 2, 3, 4, 5};
        
        assertEquals(Set.of(2, 3, 4), EqualElements.findDuplicates(array1));
        assertEquals(Set.of(1, 2, 3), EqualElements.findDuplicates(array2));
        assertEquals(Set.of(), EqualElements.findDuplicates(array3));
    }
}

