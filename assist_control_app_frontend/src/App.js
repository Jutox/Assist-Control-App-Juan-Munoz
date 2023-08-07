import React from 'react';
import logo from './logo.svg';
import './App.css';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import AddClienteComponent from './components/AddClienteComponent';
import AddContratoComponent from './components/AddContratoComponent';
import AddCargoComponent from './components/AddCargoComponent';
import {BrowserRouter, Route, Routes} from 'react-router-dom'


function App() {
  return (
    <div>
      <BrowserRouter>
        <HeaderComponent/> 
          <div className='container'>
            <Routes>
              <Route exact path = '/' element = {<ListEmployeeComponent />}></Route>
              <Route path = '/empleados' element = {<ListEmployeeComponent />}></Route>
              <Route path = '/add-empleado' element={<AddClienteComponent />}></Route>
              <Route path = '/add-contrato' element={<AddContratoComponent />}></Route>
              <Route path = '/add-cargo' element={<AddCargoComponent />}></Route>
            </Routes>
          </div>
        <FooterComponent/>
      </BrowserRouter>
    </div>
    
  );
}

export default App;
