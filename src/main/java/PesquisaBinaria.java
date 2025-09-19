public class PesquisaBinaria {

    public static int buscaBinaria(String[] arr, String nomeBuscado) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            //Comparamos o nome do meio com o nome buscado
            int comparacao = arr[meio].compareTo(nomeBuscado);

            //O método compareTo retorna:
            //0 se as strings forem iguais
            //< 0 se a string do meio for "menor" (vem antes) que a buscada
            //> 0 ser a string ddo meio for "maior" (vem depois) que a buscada

            if (comparacao == 0) {
                //Encontramos o nome, retornamos o índice
                return meio;
            } else if (comparacao < 0) {
                // O nome buscado está na metade da direita
                inicio = meio + 1;
            } else {
                // O nome buscado está na metade da esquerda
                fim = meio - 1;
            }
        }
        // Se o loop terminar e o nome não for encontrado, retornaremos -1
        return -1;
    }

    public static void main(String[] args) {
        // A lista com os nomes DEVE estar ordenada!
        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "João", "Lucas"};

        // Nome que queremos encontrar
        String nomeParaBuscar = "Gabriel";

        // Realiza a busca
        int indiceEncontrado = buscaBinaria(nomes, nomeParaBuscar);

        if (indiceEncontrado != -1){
            System.out.println("O nome '" + nomeParaBuscar + "' foi encontrado no índice: " + indiceEncontrado);
        }else {
            System.out.println("O nome '" + nomeParaBuscar + "' não foi encontrado na lista.");
        }
        System.out.println("---");

        // Exemplo de um nome que não está na lista
        String nomeNaoEncontrado = "Pedro";
        int indiceNaoEncontrado = buscaBinaria(nomes,nomeNaoEncontrado);

        if (indiceNaoEncontrado != -1){
            System.out.println("O nome '" + nomeNaoEncontrado + "' foi encontrado no índice: " + indiceNaoEncontrado);
        }else {
            System.out.println("O nome '" + nomeNaoEncontrado + "' não foi encontrado na lista.");
        }
    }
}
