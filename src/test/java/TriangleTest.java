import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_insstantiatesCorrectly() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSideOne() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(3, testTriangle.getSideOne());
  }

  @Test
  public void newTriangle_setsSideTwo() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(4, testTriangle.getSideTwo());
  }

  @Test
  public void newTriangle_setsSideThree() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(5, testTriangle.getSideThree());
  }

  @Test
  public void newTriangle_isATriangle_true(){
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isATriangle());
  }

  @Test
  public void newTriangle_isATriangle_false(){
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isATriangle());
  }

  @Test
  public void newTriangle_isEquilateralTriangle_true(){
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateralTriangle());
  }

  @Test
  public void newTriangle_isIsoscelesTriangle_true(){
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isIsoscelesTriangle());
  }

  @Test
  public void newTriangle_isScaleneTriangle_true(){
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals(true, testTriangle.isScaleneTriangle());
  }

  @Test
  public void newTriangle_whatTriangleType_ScaleneTriangle(){
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals("scalene", testTriangle.whatTriangleType());
  }
}
