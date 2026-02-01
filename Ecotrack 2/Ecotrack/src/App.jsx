import Header from "./components/header";
import Dashboard from "./pages/dashboard";
import Logs from "./pages/Logs";
import Rating from "./pages/Rating";

const App = () => {
    return (
        <>
            <Header title="EcoTrack Experiment 1" />
            <Dashboard />
            <Logs/>
            <Rating/>
        </>
    );
};

export default App;