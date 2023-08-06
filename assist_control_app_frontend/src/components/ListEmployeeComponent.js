import React, { useEffect, useState } from 'react'
import EmployeeService from '../services/EmployeeService'

export const ListEmployeeComponent = () => {

    const [employees, setEmpleados] = useState([]);

    useEffect(() =>{
        EmployeeService.getEmployees().then(response => {
            setEmpleados(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })

    },[])
    
        return (
            <div>
                 <h2 className="text-center">Lista de Empleados</h2>
                 <div className = "row">
                   
                 </div>
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

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
                                        <tr key = {employee.id}>
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
