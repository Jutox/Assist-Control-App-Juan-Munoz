import axios from 'axios';

const CARGO_API_BASE_URL = "http://localhost:8080/cargo/cargos";

class CargoService {

    createCargo(cargo){
        return axios.post(CARGO_API_BASE_URL, cargo);
    }

}

export default new CargoService()