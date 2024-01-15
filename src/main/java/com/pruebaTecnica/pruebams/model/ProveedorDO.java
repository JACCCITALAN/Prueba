package com.pruebaTecnica.pruebams.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class ProveedorDO {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id_proveedor")
	    private Integer idProveedor;
	    
	    @Column(name = "nombre")
	    private String nombre;
	    
	    @Column(name = "direccion")
	    private String direccion;
	    
	    @Column(name = "folio")
	    private String folio;
	    
	    @Column(name = "telefono")
	    private String telefono;
	    
	    @Column(name = "rfc")
	    private String rfc;

		/**
		 * @return the idProveedor
		 */
		public Integer getIdProveedor() {
			return idProveedor;
		}

		/**
		 * @param idProveedor the idProveedor to set
		 */
		public void setIdProveedor(Integer idProveedor) {
			this.idProveedor = idProveedor;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the direccion
		 */
		public String getDireccion() {
			return direccion;
		}

		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		/**
		 * @return the folio
		 */
		public String getFolio() {
			return folio;
		}

		/**
		 * @param folio the folio to set
		 */
		public void setFolio(String folio) {
			this.folio = folio;
		}

		/**
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}

		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		/**
		 * @return the rfc
		 */
		public String getRfc() {
			return rfc;
		}

		/**
		 * @param rfc the rfc to set
		 */
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}
	    
	    
	
}
