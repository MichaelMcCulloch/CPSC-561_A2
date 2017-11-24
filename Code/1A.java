public class CAS_FROM_SCAS {
    public boolean CAS(Object prev, Object succ){
        Object last = SCAS.scas(prev, succ);
        return last == prev;
    }}