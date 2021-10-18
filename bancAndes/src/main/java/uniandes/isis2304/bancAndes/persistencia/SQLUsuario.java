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

package uniandes.isis2304.bancAndes.persistencia;


import javax.jdo.PersistenceManager;
import javax.jdo.Query;



class SQLUsuario 
{
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaBancAndes.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaBancAndes pb;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/

	/**
	 * Constructor
	 * @param pb - El Manejador de persistencia de la aplicación
	 */
	public SQLUsuario (PersistenciaBancAndes pb)
	{
		this.pb = pb;
	}
	
	
	public long adicionarUsuario (PersistenceManager pm, String login, String palabra_Clave, String rol, String nombre, String tipo_Doc_Identificacion,
			Integer numero_Doc_Identificacion, String direccion_Fisica, String direccion_Electronica, Integer telefono,
			String nacionalidad, String ciudad, String departamento, Integer codigo_Postal, String bancAndes)
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pb.darTablaUsuario () + "( login, palabra_Clave, rol, nombre, tipo_Doc_Identificacion,"
        		+ " numero_Doc_Identificacion, direccion_Fisica, direccion_Electronica, telefono,"
        		+ " nacionalidad, ciudad, departamento, codigo_Postal, bancAndes)"
        		+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        q.setParameters(login, palabra_Clave, rol, nombre, tipo_Doc_Identificacion,numero_Doc_Identificacion, direccion_Fisica, direccion_Electronica, telefono,nacionalidad, 
        		ciudad, departamento, codigo_Postal, bancAndes);
        return (long) q.executeUnique();
	}
}
