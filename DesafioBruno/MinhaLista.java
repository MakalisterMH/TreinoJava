package DesafioBruno;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class MinhaLista implements List<String> {


    private String[] elementos = new String[2];

    @Override
    /**
     * verificar quantos elementos são diferentes de nulo
     */
    public int size() {
        int quantidadeNaoNula = 0;
        for (String e : elementos) {
            if (e != null) {
                quantidadeNaoNula++;
            }
        }
        return quantidadeNaoNula;
    }

    @Override
    public boolean isEmpty() {
        for (String elemento : elementos) {
            if (elemento != null && !elemento.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * verifica se o Object o existe dentro da sua lista
     * 
     * @param o element whose presence in this list is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    /**
     * converte sua lista em um array do tipo Object
     * criar um array do tipo Object do tamanho do seu array elementos
     * vc vai preencher o array novo com todos o elementos do array elemento
     * retornar o novo
     */
    public Object[] toArray() {

        Object[] obj = new Object[elementos.length];

        for (int i = 0; i < obj.length; i++) {
            obj[i] = elementos[i];
        }
        return obj;
    }

    @Override
    /**
     * adiciona um elemento no elementos
     * se o array tiver cheio, vc precisa aumentar o tamanho dele (criar um novo)
     */
    public boolean add(String s) {

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = s;
                return true;
            }
        }

        String[] novoVetor = new String[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novoVetor[i] = elementos[i];
        }

        for (int i = 0; i < novoVetor.length; i++) {
            if (novoVetor[i] == null) {
                novoVetor[i] = s;
                elementos = novoVetor;
                return true;
            }
        }

        return true;

    }

    @Override
    /**
     * remover o elemento
     * diminuir o array quando mais de 100 posições tiverem vazias
     * se o array tiver 100, e vc remover o elemento na posição 40,
     * todos os postoeriores precisam se realocados para uma posição anterior
     */
    public boolean remove(Object o) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == o) {
                elementos[i] = null;
                break;
            }
        }
        return true;
    }

    @Override
    /**
     * limpar todos os elementos
     */
    public void clear() {
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = null;
        }
    }

    // [null, null]

    @Override
    /**
     * retornar o elemento na posição index
     */
    public String get(int index) {
        return elementos[index];
    }

    @Override
    /**
     * alterar o elemento na posição do index
     */
    public String set(int index, String element) {
        return elementos[index] = element;
    }

    @Override
    /**
     * adicionar na posiçãp do indice
     * mover os elementos a partir da posição do indice uma pisição pra frente
     * lembrar de aumentar a lista se precisar
     */
    public void add(int index, String element) {

        String auxiliar, auxiliar2;

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[index] != null) {
                auxiliar = elementos[index];
                elementos[index] = element;

                for (int x = index; x < elementos.length - 1; x++) {
                    auxiliar2 = elementos[x + 1];
                    elementos[x + 1] = auxiliar;
                    auxiliar = auxiliar2;
                }
                break;
            }
        }
    }

    @Override
    /**
     * remover da posição index
     * puxar todos os elementos a partir da posição index uma posição pra trás
     */
    public String remove(int index) {

        String valorRemovido = elementos[index];
        elementos[index] = null;

        for (int i = index; i < elementos.length - 1; i++) {
            if (elementos[i] == null) {
                elementos[i] = elementos[i + 1];
                elementos[i + 1] = null;
            }
        }

        return valorRemovido;

    }

    public void imprimir() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.printf("Nome: %s \n", elementos[i]);
        }
    }

    @Override
    /**
     * percorrer os elementos e retornar o indice do elemento igual oa elemento
     * passado de parametro
     * [bruno, amanda, makalister] e o = makalister o indice retornar e 2
     */
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    /**
     * percorrer os elementos e retornar o indice do ultimo elemento igual oa
     * elemento passado de parametro
     *
     * [bruno, amanda, makalister, bruno] e o = bruno o indice retornar e 3
     */
    public int lastIndexOf(Object o) {
        return 0;
    }

    // =======================================================================================

    @Override
    /**
     * ignora
     */
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    /**
     * ignora
     */
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    /**
     * ignorar
     */
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    /**
     * ignorar
     */
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    /**
     * ignora
     */
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    /**
     * ignora
     */
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    /**
     * ignora
     */
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    /**
     * ignora
     */
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    /**
     * ignora
     */
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    /**
     * ignorar
     */
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }

}
