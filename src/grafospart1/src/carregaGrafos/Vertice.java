/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafospart1.src.carregaGrafos;

/**
 *
 * @author Marcio
 */
public class Vertice {
    private int num;
    private Vertice proximo;

    public Vertice(int num, Vertice proximo) {
        this.num = num;
        this.proximo = proximo;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Vertice getProximo() {
        return proximo;
    }

    public void setProximo(Vertice proximo) {
        this.proximo = proximo;
    }
    
}
