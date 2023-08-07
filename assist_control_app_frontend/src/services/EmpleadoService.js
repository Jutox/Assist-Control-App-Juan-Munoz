import axios from 'axios';

const Empleado_API_BASE_URL = "http://localhost:8080/empleado/empleados";

class EmpleadoService {

    getEmpleados(){
        return axios.get(Empleado_API_BASE_URL);
    }

    createEmpleado(empleado){
        return axios.post(Empleado_API_BASE_URL, empleado);
    }
}

export default new EmpleadoService()