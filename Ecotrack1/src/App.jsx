import useWindowSize from "./useWindowSize";

const App = () => {
  
  const { width, height } = useWindow();

  return (
    <div>
      <h2>Window Size</h2>
      <p>Width:{width}</p>
      <p>Height:{height}</p>
    </div>
  );
};

export default App;
