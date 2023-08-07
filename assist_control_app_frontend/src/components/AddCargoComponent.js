import React, { useState} from 'react'
import { useNavigate } from 'react-router-dom';
import { Link } from 'react-router-dom';
import CargoService from '../services/cargoService.js'


export const AddCargoComponent = () => {

    const [tipoCargo, setCargo] = useState('');
    const navigate = useNavigate();

    const saveCargo = (e) => {
        e.preventDefault();
        const cargo = {tipoCargo}
        CargoService.createCargo(cargo).then((response) => {
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
                                <h2 className='text-center'>Creacion de cargo</h2>
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group mb-2">
                                            <label> Tipo cargo: </label>
                                            <input placeholder="nuevo cargo" 
                                            name="tipoCargo" 
                                            className="form-control" 
                                            value={tipoCargo} 
                                            onChange={(e) => setCargo(e.target.value)}/>
                                        </div>

                                        <button className="btn btn-success" onClick={(e) => saveCargo(e)}>Guardar</button>
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

export default AddCargoComponent;