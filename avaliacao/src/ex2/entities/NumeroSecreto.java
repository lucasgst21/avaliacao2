/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.entities;

/**
 *
 * @author Jose Carlos Vaz Felipe <joseka.vf@gmail.com> e Lucas Gabriel Silva Teixeira <lucaslgstt@gmail.com>
 * @date 01/04/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {

    private long numeroAleatorio;

    public NumeroSecreto() {
        this.numeroAleatorio = -1;
    }

    public void sortear() {
        this.numeroAleatorio = (Math.round(Math.random() * 100));
    }

    public int adivinhar(long palpite) {
        int retorno;
        if (this.numeroAleatorio == -1) {
            retorno = -2;
        } else if (this.numeroAleatorio < palpite) {
            retorno = -1;
        } else if (this.numeroAleatorio == palpite) {
            retorno = 0;
        } else {
            retorno = 1;
        }

        return retorno;

    }

}
