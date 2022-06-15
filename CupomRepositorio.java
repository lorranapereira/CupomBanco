import java.util.Optional;

/**
 * Repositório representa a persistência de dos cupons
 */
interface CupomRepositorio {
    Optional<Cupom> buscar(Integer id);
    void salvar(Cupom cupom);

}
