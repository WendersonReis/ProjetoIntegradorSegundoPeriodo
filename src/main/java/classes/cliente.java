/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enumeradores.*;
import classes.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class cliente {

    private telefone telefone;
    private int ID;
    private endereco endereco;
    private String email;
    private tipoCliente tipoCliente;
    private String CPF_CNPJ;
    private Date dataNascimento;
    private String razaoSocial;

    public telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(telefone telefone) {
        this.telefone = telefone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public tipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "cliente{" + "telefone=" + telefone + ", ID=" + ID + ", endereco=" + endereco + ", email=" + email + ", tipoCliente=" + tipoCliente + ", CPF_CNPJ=" + CPF_CNPJ + ", dataNascimento=" + dataNascimento + ", razaoSocial=" + razaoSocial + '}';
    }

}
