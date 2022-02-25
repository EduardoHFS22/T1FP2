/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@ViewScoped
public class ControleUsuario implements Serializable {

    private Usuario u;

    public ControleUsuario() {
        this.u = new Usuario();
    }

    public void validar() {
        if (this.u.getClass().equals(u.getSenha())) {
            addMessage(FacesMessage.SEVERITY_INFO, "Informação", "Cadastro realizado.");
        } else {

        }
    }


}
