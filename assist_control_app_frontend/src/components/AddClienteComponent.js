import React, { useState} from 'react'
import { useNavigate } from 'react-router-dom';
import { Link } from 'react-router-dom';
import EmployeeService from '../services/EmployeeService'


export const AddClienteComponent = () => {

    const [nombres, setNombre] = useState('');
    const [apellidos, setApellido] = useState('');
    const [correo, setCorreo] = useState('');
    const navigate = useNavigate();

    const saveCliente = (e) => {
        e.preventDefault();
        const empleado = {nombres, apellidos, correo}
        EmployeeService.createEmployee(empleado).then((response) => {
            console.log(response.data);
            navigate('/empleados')
        }).catch(error => {
            console.log(error)
        })
    }

    return(
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                <h2 className='text-center'>Registro de empleados</h2>
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group mb-2">
                                            <label> First Name: </label>
                                            <input placeholder="First Name" 
                                            name="firstName" 
                                            className="form-control" 
                                            value={nombres} 
                                            onChange={(e) => setNombre(e.target.value)}/>
                                        </div>

                                        <div className = "form-group mb-2">
                                            <label> Last Name: </label>
                                            <input placeholder="Last Name" 
                                            name="lastName" className="form-control" 
                                            value={apellidos} 
                                            onChange={(e) => setApellido(e.target.value)}/>
                                        </div>

                                        <div className = "form-group mb-2">
                                            <label> Email Id: </label>
                                            <input placeholder="Email Address" 
                                            name="emailId" className="form-control" 
                                            value={correo} 
                                            onChange={(e) => setCorreo(e.target.value)}/>
                                        </div>

                                        <button className="btn btn-success" onClick={(e) => saveCliente(e)}>Guardar</button>
                                        &nbsp;&nbsp;&nbsp;
                                        <Link to='/empleados' className='btn btn-danger'>Cancelar</Link>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
    )
}

export default AddClienteComponent;
