import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest(){
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle tester");
  }

  @Test
  public void isNotATriangle(){
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("50");
    submit(".btn");
    assertThat(pageSource()).contains("You cannot make a triangle with those sides!");
  }

  @Test
  public void isIsoscelesTriangle(){
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("isosceles");
  }

  @Test
  public void isEquilateralTriangle(){
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("2");
    submit(".btn");
    assertThat(pageSource()).contains("equilateral");
  }

  @Test
  public void isScaleneTriangle(){
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("3");
    fill("#sideThree").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("scalene");
  }
}
