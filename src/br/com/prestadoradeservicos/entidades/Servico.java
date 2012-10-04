/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.prestadoradeservicos.entidades;

import java.util.Date;

/**
 *
 * @author Anderson Luis Ribeiro
 */
public class Servico {

    private Integer id;
    private TipoDeServico tipoDeServico;
    private Cliente cliente;
    private Date dataDoServico;
    private Integer numeroDoServico;
    private Double valorDoServico;

    public Servico() {

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
     * @return the tipoDeServico
     */
    public TipoDeServico getTipoDeServico() {
        return tipoDeServico;
    }

    /**
     * @param tipoDeServico the tipoDeServico to set
     */
    public void setTipoDeServico(TipoDeServico tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the dataDoServico
     */
    public Date getDataDoServico() {
        return dataDoServico;
    }

    /**
     * @param dataDoServico the dataDoServico to set
     */
    public void setDataDoServico(Date dataDoServico) {
        this.dataDoServico = dataDoServico;
    }

    /**
     * @return the numeroDoServico
     */
    public Integer getNumeroDoServico() {
        return numeroDoServico;
    }

    /**
     * @param numeroDoServico the numeroDoServico to set
     */
    public void setNumeroDoServico(Integer numeroDoServico) {
        this.numeroDoServico = numeroDoServico;
    }

    /**
     * @return the valorDoServico
     */
    public Double getValorDoServico() {
        return valorDoServico;
    }

    /**
     * @param valorDoServico the valorDoServico to set
     */
    public void setValorDoServico(Double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Servico other = (Servico) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getTipoDeServico().getDescricao();
    }

    

}
