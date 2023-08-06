import React, { useEffect, useState } from 'react'
import EmployeeService from '../services/EmployeeService'
//import ContratoService from '../services/ContratoService'

export const ListEmployeeComponent = () => {

    const [employees, setEmpleados] = useState([]);
    const [contratos, setContratos] = useState([]);

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
                 <div className="row">
                 </div>
                 <br></br>
                 <div className="row justify-content-center"> {/* Aquí agregamos "justify-content-center" para centrar la tabla */}
                        <table className="table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Employee First Name</th>
                                    <th> Employee Last Name</th>
                                    <th> Employee Email Id</th>
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
                                             <td> {employee.id_cargo}</td>
                                             <td> {employee.id_contrato}</td>
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