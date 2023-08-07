import React, { useEffect, useState } from 'react'
import EmployeeService from '../services/EmployeeService'
import { Link } from 'react-router-dom';
//import ContratoService from '../services/ContratoService'

export const ListEmployeeComponent = () => {

    const [employees, setEmpleados] = useState([]);
    //onst [contratos, setContratos] = useState([]);

    /*
    useEffect(() =>{
        ContratoService.getContratos().then(response => {
            setContratos(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })

    },[])
    */
    
    useEffect(() =>{
        EmployeeService.getEmployees().then(response => {
            setEmpleados(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })

    },[])
    
        return (
            <div className="container"> {/* Aquí agregamos la clase "container" */}
                 <h2 className="text-center">Lista de Empleados</h2>
                 <Link to= '/add-Empleado' className='btn btn-primary mb-2'>Agregar Cliente</Link>
                 <div className="row">
                 </div>
                 <br></br>
                 <div className="row justify-content-center"> {/* Aquí agregamos "justify-content-center" para centrar la tabla */}
                        <table className="table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Nombres</th>
                                    <th> Apellidos</th>
                                    <th> Correo</th>
                                    <th> Cargo</th>
                                    <th> Contrato</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    employees.map(
                                        employee => 
                                        <tr key={employee.id}>
                                             <td> {employee.nombres} </td>   
                                             <td> {employee.apellidos}</td>
                                             <td> {employee.correo}</td>
                                             <td> {employee.cargo.tipoCargo}</td>
                                             <td> {employee.contrato.tipoContrato}</td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>
                 </div>
            </div>
        )
}

export default ListEmployeeComponent;