import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import NavBar from "./components/NavBar";
import ProjectBoard from "./components/ProjectBoard";
import AddProjectTask from "./components/ProjectTask/AddProjectTask";
import UpdateProjectTask from "./components/ProjectTask/UpdateProjectTask";
import { BrowserRouter as Router, Route } from "react-router-dom";
import React from "react";
import { Provider } from "react-redux";
import store from "./store";

function App() {
  return (
    <Provider store={store}>
      <Router>
        <div className="App">
          <NavBar />
          <Route exact path="/" component={ProjectBoard} />
          <Route exact path="/addProjectTask" component={AddProjectTask} />
          <Route exact path="/updateProjectTask/:pt_id" component={UpdateProjectTask} />
        </div>
      </Router>
    </Provider>
  );
}

export default App;
