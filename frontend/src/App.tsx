import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {


  async function getAllTasks() {
    const response = await fetch('/api/tasks');
    const data = await response.json();
    console.log(data);
  }

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.

          <button className="btn btn-sm btn-primary" onClick={getAllTasks}>Get All</button>
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
