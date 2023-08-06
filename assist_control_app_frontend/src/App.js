import React from 'react';
import logo from './logo.svg';
import './App.css';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import AddClienteComponent from './components/AddClienteComponent';
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
            </Routes>
          </div>
        <FooterComponent/>
      </BrowserRouter>
    </div>
    
  );
}

export default App;
