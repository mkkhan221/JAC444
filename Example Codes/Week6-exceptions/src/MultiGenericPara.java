public class MultiGenericPara<T, S> {
    private T firstPosition;
    private S secondPosition;

    public MultiGenericPara(T firstPosition, S secondPosition){
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
    }

    public T getFirstPosition(){
        return firstPosition;
    }

    public void setFirstPosition(T firstPosition){
        this.firstPosition = firstPosition;
    }

    public S getSecondPosition(){
        return secondPosition;
    }

    public void setSecondPosition(S secondPosition){
        this.secondPosition = secondPosition;
    }

}