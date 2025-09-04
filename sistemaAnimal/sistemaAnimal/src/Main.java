import br.com.alura.animal.classes.Cachorro;
import br.com.alura.animal.classes.Esquilo;
import br.com.alura.animal.classes.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro("Totó", "São Bernardo", 6);
        Gato gato01 = new Gato("Fifi", "Siâmes", 4);
        Esquilo esquilo01 = new Esquilo("Alvin", "Esquilo voador", 2);

        cachorro01.emitirSom();
        cachorro01.abanarRabo();

        gato01.emitirSom();
        gato01.arranhaMoveis();

        esquilo01.emitirSom();
        esquilo01.roerNoz();
    }
}