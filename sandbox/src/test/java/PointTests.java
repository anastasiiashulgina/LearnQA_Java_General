import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTests {

  @Test
  public void testDistancePositiveNumber(){
    Point p1 = new Point(1,1);
    Point p2 = new Point(1,2);
    assert p1.distance(p2) == 1.0;

  }

  @Test
  public void testDistanceNegativeNumber(){
    Point p1 = new Point(-1,-1);
    Point p2 = new Point(-1,-2);
    assert p1.distance(p2) == 1.0;

  }
  @Test
  public void testDistanceZero(){
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    assert p1.distance(p2) == 0.0;

  }

}
