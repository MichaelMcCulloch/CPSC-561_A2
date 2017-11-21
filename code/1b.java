public class SCAS_FROM_CAS {
    private CAS cas;
    public Object SCAS(Object e, Object v){
        Object original = cas.read();
        cas.cas(e, v);
        return original;
    }
    public Object read() {
        return cas.read();
    }
}