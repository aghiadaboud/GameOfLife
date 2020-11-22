import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class GOLTest {


  @Test
  void methode1() {
    GOL gol = new GOL();
    assertThat(gol.getClassName()).isEqualTo("GOL");
  }
}
