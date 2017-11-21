public class CAS_FROM_SCAS {
    private SCAS scas;
    public boolean CAS(Object e, Object v){
        scas.scas(e, v);
        Object after = scas.read();
        return (after == v);
    }
    public Object read() {
        return scas.read();
    }
}