import axios from 'axios';

const Empleado_API_BASE_URL = "http://localhost:8080/empleado/empleados";

class EmpleadoService {

    getEmpleados(){
        return axios.get(Empleado_API_BASE_URL);
    }

    createEmpleado(empleado){
        return axios.post(Empleado_API_BASE_URL, empleado);
    }

    getEmpleadoById(empleadoId){
        return axios.get(Empleado_API_BASE_URL + '/' + empleadoId);
    }

    updateEmpleado(empleado, empleadoId){
        return axios.put(Empleado_API_BASE_URL + '/' + empleadoId, empleado);
    }

    deleteEmpleado(empleadoId){
        return axios.delete(Empleado_API_BASE_URL + '/' + empleadoId);
    }
}

export default new EmpleadoService()