package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerformance {

  // TODO run test and record running times for SIZE = 10, 100, 1000, 10000, ...
  public int[] SIZES = {10, 100, 1000, 10000, 100000};
  // (choose in conjunction with REPS below up to an upper limit where the clock
  // running time is in the tens of seconds)
  // TODO (optional) refactor to DRY
  // which of the two lists performs better as the size increases?
  private final int SIZE = 10;

  // TODO choose this value in such a way that you can observe an actual effect
  // for increasing problem sizes
  private final int REPS = 1000000;

  private List<Integer> arrayList;

  private List<Integer> linkedList;

  @Before
  public void setUp() throws Exception {
    arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (var i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  @After
  public void tearDown() throws Exception {
    arrayList = null;
    linkedList = null;
  }

  @Test
  public void testLinkedListAddRemove() {
    for (var r = 0; r < REPS; r++) {
      linkedList.add(0, 77);
      linkedList.remove(0);
    }
  }

  public void clearList(int size) {
    arrayList.clear();
    linkedList.clear();
    for(int i = 0; i < size; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  @Test
  public void testArrayListAddRemove() {
    for (int size : SIZES) {
      clearList(size);
      System.out.println("Testing add and remove for size " + size);
      long startTime = System.currentTimeMillis();
      for(int k = 0; k < REPS; k++) {
        linkedList.add(0, 77);
        linkedList.remove(0);
      }
      long endTime = System.currentTimeMillis();
      System.out.println("Add and remove time: " + (endTime-startTime));
      System.out.println();
    }
    for (var r = 0; r < REPS; r++) {
      arrayList.add(0, 77);
      arrayList.remove(0);
    }
  }

  @Test
  public void testLinkedListAccess() {
    var sum = 0L;
    for(int sizes : SIZES) {
      clearList(sizes);
      System.out.println("Testing linkedList access for size: " + sizes);
      long startTime = System.currentTimeMillis();
      for (var r = 0; r < REPS; r++) {
        sum += linkedList.get(r % SIZE);
      }
      long endTime = System.currentTimeMillis();
      System.out.println("LinkedList access time: " + (endTime-startTime));
    }





  }

  @Test
  public void testArrayListAccess() {
    var sum = 0L;
    for(int sizes : SIZES) {
      clearList(sizes);
      System.out.println("Testing ArrayList access for size: " + sizes);
      long startTime = System.currentTimeMillis();
      for (var r = 0; r < REPS; r++) {
        sum += arrayList.get(r % SIZE);
      }
      long endTime = System.currentTimeMillis();
      System.out.println("ArrayList access time: " + (endTime-startTime));
    }

  }
}
