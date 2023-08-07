import React, { useState} from 'react'
import { useNavigate } from 'react-router-dom';
import { Link } from 'react-router-dom';
import ContratoService from '../services/contratoService.js'


export const AddContratoComponent = () => {

    const [tipoContrato, setContrato] = useState('');
    const navigate = useNavigate();

    const saveContrato = (e) => {
        e.preventDefault();
        const contrato = {tipoContrato}
        ContratoService.createContrato(contrato).then((response) => {
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
                                <h2 className='text-center'>Creacion de Contrato</h2>
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group mb-2">
                                            <label> Tipo contrato: </label>
                                            <input placeholder="nuevo contrato" 
                                            name="tipoContrato" 
                                            className="form-control" 
                                            value={tipoContrato} 
                                            onChange={(e) => setContrato(e.target.value)}/>
                                        </div>

                                        <button className="btn btn-success" onClick={(e) => saveContrato(e)}>Guardar</button>
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

export default AddContratoComponent;
