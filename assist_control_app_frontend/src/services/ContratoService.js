import axios from 'axios';

const CONTRATO_API_BASE_URL = "http://localhost:8080/contrato/contratos";

class ContratoService {

    getContratoById(contratoId){
        return axios.get(CONTRATO_API_BASE_URL + '/' + contratoId);
    }

    createContrato(contrato){
        return axios.post(CONTRATO_API_BASE_URL, contrato);
    }


}

export default new ContratoService()