import axios from 'axios';

const CARGO_API_BASE_URL = "http://localhost:8080/cargo/cargos";

class CargoService {

    getCargoById(cargoId){
        return axios.get(CARGO_API_BASE_URL + '/' + cargoId);
    }

    createCargo(cargo){
        return axios.post(CARGO_API_BASE_URL, cargo);
    }


}

export default new CargoService()