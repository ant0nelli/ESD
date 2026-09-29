public class Requisicoes implements Comparable {
    private int idRequisicao;

    public Requisicoes(int idRequisicao){
        this.idRequisicao = idRequisicao;
    }

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
