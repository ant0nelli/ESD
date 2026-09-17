package ads.esd;

public class MainEditor {

    static void main(){
        EditorTexto editor = new EditorTexto();

        editor.escrever("ola ");
        editor.escrever("mundo ");

        System.out.println("Conteúdo atual: " + editor.getConteudo());

        editor.desfazer();
        System.out.println("Conteúdo após desfazer " + editor.getConteudo());

        editor.refazer();
        System.out.println("Conteúdo após refazer " + editor.getConteudo());

        editor.escrever("Estudar");
        System.out.println("Conteúdo final: " + editor.getConteudo());
    }


}
