package aula;

public class Threads_01 {
    // Declaração de uma variável estática compartilhada entre todas as threads.
    static int i = 0;

    public static void main(String[] args) {
        // Cria e inicia a primeira thread que executará o Runnable 't1'.
        new Thread(t1).start();
        // Cria e inicia a segunda thread que executará o Runnable 't2'.
        new Thread(t2).start();
    }

    // Método estático que incrementa o contador e exibe seu valor e o nome da thread.
    private static void contador(String name) {
        // Incrementa a variável estática 'i' (não é thread-safe).
        i++;
        // Imprime o valor atual de 'i' e o nome da thread que executou este método.
        System.out.println("O valor do contador atual é: " + i + ", thread : " + name);
    }

    // Definição da primeira tarefa (Runnable) que será executada pela thread 't1'.
    private static Runnable t1 = new Runnable() {
        public void run() {
            try {
                // Laço que chama o método 'contador' 5 vezes.
                for (int i = 0; i < 5; i++) {
                    contador("t1");
                }
            } catch (Exception e) {
                // Captura e ignora qualquer exceção que possa ocorrer.
            }
        }
    };

    // Definição da segunda tarefa (Runnable) que será executada pela thread 't2'.
    private static Runnable t2 = new Runnable() {
        public void run() {
            try {
                // Laço que chama o método 'contador' 5 vezes.
                for (int i = 0; i < 5; i++) {
                    contador("t2");
                }
            } catch (Exception e) {
                // Captura e ignora qualquer exceção que possa ocorrer.
            }
        }
    };

}
