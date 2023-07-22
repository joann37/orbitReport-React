import satData from "./satData";
import styling from "../components/styling.css";


const Buttons = (props) => {
  return (
    <div className="flex-container">
    {props.displaySats.map((sat, id) => { 
     return(
      <button onClick={() => props.filterByType(sat)} key={id}>
       {sat} Orbit
      </button>
     );
   })}
    <button onClick= {()=> props.setSat(satData)}>All Orbits</button>
 </div>
  );
};

export default Buttons;