public class CAS_FROM_LLSC {
    public boolean CAS(Object prev, Object succ){
        Object old = LLSC.ll();
        if (old != prev){
            return false;
        } else {
            return LLSC.sc(succ);
        }}}