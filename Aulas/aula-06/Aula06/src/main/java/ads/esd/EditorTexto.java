package ads.esd;

public class EditorTexto{
    private Stack<String> undo;
    private Stack<String> redo;
    private String conteudo;

    public EditorTexto(){
        this.undo = new Stack<>(20);
        this.redo = new Stack<>(20);
        this.conteudo = "";
    }

    public void escrever(String texto){
        undo.push(conteudo);

        conteudo += texto;

        //Limpando pilha de refazer
        redo = new Stack<>(20);
    }

    public void desfazer(){
        if (!undo.isEmpty()){
            redo.push(conteudo);
            conteudo = undo.pop();


        }else{
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer(){
        if (!redo.isEmpty()){
            undo.push(conteudo);
            conteudo = redo.pop();

        }else{
            System.out.println("Nada para refazer.");
        }
    }


    public String getConteudo() {
        return this.conteudo;
    }
}