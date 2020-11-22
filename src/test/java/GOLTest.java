import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

public class GOLTest {


  @Test
  void methode1() {
    GOL gol = new GOL();
    assertThat(gol.getClassName()).isEqualTo("GOL");
  }

  @Test
  void methode2() {
    GOL gol = new GOL();
    assertThat(gol.getClassNameLowerCase()).isEqualTo("gol");
  }
}
