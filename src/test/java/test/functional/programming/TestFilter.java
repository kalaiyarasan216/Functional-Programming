package test.functional.programming;

import com.functional.program.Filter;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestFilter {
    List<Integer> list = List.of(10,20,30,40);
   @Test
    public void  checkLength(){
       assertEquals(4, Filter.checkListLength(list));
   }
}
