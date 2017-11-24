public class SCAS_FROM_CAS {
    public Object SCAS(Object prev, Object succ){
        boolean success = CAS.cas(prev, succ);
        if (success) {
            return prev;
        } else {
            return CAS.read();
        }}}