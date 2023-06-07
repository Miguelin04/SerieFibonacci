import java.util.*;

public class Serie {
    private Map<Integer,Long> valorList;

    public Serie(){
        this.valorList = new HashMap<Integer, Long>();
    }

    public long getFibonacci(int posicion){
        if(posicion ==0 || posicion == 1){
            return 1;
        }else{
            if(valorList.containsKey(posicion)){
                return valorList.get(posicion);
            }else{
                long valor = getFibonacci(posicion-1) + getFibonacci(posicion-2);
                valorList.put(posicion, valor);
                return valor;
            }
        }
    }

    public Map<Integer, Long> getValorList() {
        return valorList;
    }

    public void setValorList(Map<Integer, Long> valorList) {
        this.valorList = valorList;
    }

    public String toString(){
        return "serie{valor = "+ valorList + '}';
    }
}

