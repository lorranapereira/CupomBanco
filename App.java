import java.math.BigDecimal;
import java.util.Optional;

class App {
    public static void main(String[] args) {
        Cupom teste = new Cupom(BigDecimal.valueOf(1000));
        teste.resgatar(BigDecimal.valueOf(1001));
        System.out.println(teste.getSaldo());
        //PERSISTENCIA = ARMAZENAR EM QUALQUER LUGAR ESTÁTICO
        Cupom teste2 = new Cupom(BigDecimal.valueOf(500));
        CupomRepositorio repo = null;
        
        Optional<Cupom> c123 = repo.buscar(123);

        if (c123.isPresent()){
            c123.get().resgatar(BigDecimal.valueOf(200));
            System.out.println(c123.get().getSaldo());
            repo.salvar(c123.get());
        }
    }
}