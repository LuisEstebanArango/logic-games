/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lafontana.games.game2;

/**
 *
 * @author luis
 */
public class Question {

    String enunciado;
    String imgEnunciado;
    String imgOpcion1;
    String imgOpcion2;
    String imgOpcion3;
    String imgOpcion4;

    public Question(String enunciado, String imgEnunciado, String imgOpcion1, String imgOpcion2, String imgOpcion3, String imgOpcion4) {
        this.enunciado = enunciado;
        this.imgEnunciado = imgEnunciado;
        this.imgOpcion1 = imgOpcion1;
        this.imgOpcion2 = imgOpcion2;
        this.imgOpcion3 = imgOpcion3;
        this.imgOpcion4 = imgOpcion4;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getImgEnunciado() {
        return imgEnunciado;
    }

    public void setImgEnunciado(String imgEnunciado) {
        this.imgEnunciado = imgEnunciado;
    }

    public String getImgOpcion1() {
        return imgOpcion1;
    }

    public void setImgOpcion1(String imgOpcion1) {
        this.imgOpcion1 = imgOpcion1;
    }

    public String getImgOpcion2() {
        return imgOpcion2;
    }

    public void setImgOpcion2(String imgOpcion2) {
        this.imgOpcion2 = imgOpcion2;
    }

    public String getImgOpcion3() {
        return imgOpcion3;
    }

    public void setImgOpcion3(String imgOpcion3) {
        this.imgOpcion3 = imgOpcion3;
    }

    public String getImgOpcion4() {
        return imgOpcion4;
    }

    public void setImgOpcion4(String imgOpcion4) {
        this.imgOpcion4 = imgOpcion4;
    }

}
