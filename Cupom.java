import java.math.BigDecimal;
/**
 * Classe que representa um cupom com um saldo para regate.
 */
  
class Cupom {
    // quando se tem um set não tem final
    // int não definido é zero 
    //integer é nulo melhor utilizar no banco por isso
    private Integer id;
    private BigDecimal saldo;
    
    Cupom(Integer id, BigDecimal saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    Cupom(BigDecimal saldo) {
        this.saldo = saldo;
    }
    void resgatar(BigDecimal valor){
        if (saldo.subtract(valor).compareTo(BigDecimal.ZERO) >= 0) {
            saldo = saldo.subtract(valor);
        } else {
            throw new SaldoInsuficienteException();
        }
        
    }
    BigDecimal getSaldo() {
        return saldo;
    }
    Integer getId() {
        return id;
    }
    void setId(Integer id) {
        this.id = id;
    }
}
