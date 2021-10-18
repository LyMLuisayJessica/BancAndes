/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.bancAndes.negocio;

/**
 * Clase para modelar el concepto BEBIDA del negocio de los Parranderos
 *
 * @author Germán Bravo
 */
public class Accion implements VOAccion
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de la bebida
	 */
	private long id;
	
	/**
	 * Constructor por defecto
	 */
	public Accion() 
	{
		this.id = 0;
	}

	/**
	 * Constructor con valores
	 * @param id - El id de la bebida
	 * @param nombre - El nombre de la bebida
	 * @param tipo - El identificador del tipo de bebida
	 * @param gradoAlcohol - El graddo de alcohol de la bebida (Mayor que 0)
	 */
	public Accion(long id) 
	{
		this.id = id;

	}

	/**
	 * @return El id de la bebida
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @param id - El nuevo id de la bebida 
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	@Override
	public String toString() {
		return "Accion [id=" + id + "]";
	}

	
}
