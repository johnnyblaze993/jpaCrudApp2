import { useEffect } from "react";
import "./App.css";

function App() {
	useEffect(() => {
		fetch("http://127.0.0.1:8080/users", {
			mode: "cors",
			headers: {
				"Content-Type": "application/json",
			},
		})
			.then((response) => response.json())
			.then((data) => console.log(data))
			.catch((error) => console.error("Error:", error));
	}, []);

	return <div>Hey</div>;
}

export default App;
