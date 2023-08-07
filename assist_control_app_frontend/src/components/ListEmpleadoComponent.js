import React, { useEffect, useState } from 'react';
import EmpleadoService from '../services/EmpleadoService';
import { Link } from 'react-router-dom';

export const ListEmpleadoComponent = () => {
    const [empleados, setEmpleados] = useState([]);
    const [searchName, setSearchName] = useState('');
    const [searchCargo, setSearchCargo] = useState('');
    const [searchContrato, setSearchContrato] = useState('');

    useEffect(() => {
        EmpleadoService.getEmpleados().then((response) => {
            setEmpleados(response.data);
            console.log(response.data);
        }).catch((error) => {
            console.log(error);
        });
    }, []);

    const filteredEmpleados = empleados.filter((empleado) => {
        return (
            empleado.nombres.toLowerCase().includes(searchName.toLowerCase()) &&
            empleado.cargo.tipoCargo.toLowerCase().includes(searchCargo.toLowerCase()) &&
            empleado.contrato.tipoContrato.toLowerCase().includes(searchContrato.toLowerCase())
        );
    });

    return (
        <div className="container">
            <h2 className="text-center">Lista de Empleados</h2>
            <Link to="/add-Empleado" className="btn btn-primary mb-2">
                Agregar Cliente
            </Link>
            &nbsp;&nbsp;&nbsp;
            <Link to="/add-Contrato" className="btn btn-primary mb-2">
                Agregar Contrato
            </Link>
            &nbsp;&nbsp;&nbsp;
            <Link to="/add-Cargo" className="btn btn-primary mb-2">
                Agregar Cargo
            </Link>
            <div className="row">
                <div className="col-md-4">
                    <input
                        type="text"
                        placeholder="Buscar por nombre"
                        onChange={(e) => setSearchName(e.target.value)}
                        className="form-control mb-3"
                    />
                </div>
                <div className="col-md-4">
                    <input
                        type="text"
                        placeholder="Buscar por cargo"
                        onChange={(e) => setSearchCargo(e.target.value)}
                        className="form-control mb-3"
                    />
                </div>
                <div className="col-md-4">
                    <input
                        type="text"
                        placeholder="Buscar por contrato"
                        onChange={(e) => setSearchContrato(e.target.value)}
                        className="form-control mb-3"
                    />
                </div>
            </div>
            <div className="row justify-content-center">
                <table className="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>Correo</th>
                            <th>Cargo</th>
                            <th>Contrato</th>
                        </tr>
                    </thead>
                    <tbody>
                        {filteredEmpleados.map((empleado) => (
                            <tr key={empleado.id}>
                                <td>{empleado.nombres}</td>
                                <td>{empleado.apellidos}</td>
                                <td>{empleado.correo}</td>
                                <td>{empleado.cargo.tipoCargo}</td>
                                <td>{empleado.contrato.tipoContrato}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    );
};

export default ListEmpleadoComponent;
