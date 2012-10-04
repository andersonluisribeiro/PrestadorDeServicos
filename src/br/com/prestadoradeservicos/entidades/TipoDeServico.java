/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.prestadoradeservicos.entidades;

/**
 *
 * @author Anderson Luis Ribeiro
 */
public class TipoDeServico {

    private Integer id;
    private String descricao;


    public TipoDeServico() {

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoDeServico other = (TipoDeServico) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return getDescricao();
    }



    


}
