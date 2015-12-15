package test.java.task2;

import com.company.task1.Pen;
import com.company.task2.Notebook;
import com.company.task2.Worker;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ira on 16.12.2015.
 */
public class WorkerTest {
    @Test
    public void testWorker() {
        Pen p1 = new Pen(Color.BLACK, 20);
        Pen p2 = new Pen(Color.BLACK, 20);
        Pen p3 = new Pen(Color.BLACK, 20);
        Notebook n1 = new Notebook(48,35);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        Worker worker = new Worker(5);
        worker.addPen(p1);
        worker.addPen(p2);
        worker.addNotebook(n1);

        assertEquals(75, worker.calcSumPrice(),0.1);
        worker.addPen(p3);
        assertEquals(75, worker.calcSumPrice(), 0.1);
    }

}
