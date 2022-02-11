import './App.css';
import FetchRender from './FetchRender';
import ReferencedList from './ReferencedList';


function App() {

    return (
        <div className="App">
            <header className="App-header">
                <h2>Book List</h2>
                <FetchRender fetchUrl={"http://localhost:8080/api/books"}>
                    {/* Receive the response.data object and build a view */}
                    { (data) => <table className="outside-table dark-table">
                                    <thead>
                                        <tr>
                                            <th className="dark-head">
                                                Books
                                            </th>
                                            <th className="dark-head">
                                                Publishings
                                            </th>
                                        </tr>      
                                    </thead>
                                    <tbody>
                                    { data.content.map( item => (
                                        <tr key={item.id} className="dark-row">
                                            <td className="dark-cell">
                                                {item.title}
                                            </td>
                                            <td className="dark-cell">
                                                {/* Custom component */}
                                                <ReferencedList 
                                                    fetchUrl={"http://localhost:8080/api/publishings?bookId="} 
                                                    refId={item.id} 
                                                />
                                            </td>
                                        </tr>                                     
                                    ))}
                                    </tbody>
                                </table> }
                </FetchRender>
                <p className="signature"><b>eduraices, 2022</b>. This project was inspired by some basic guides for Spring Boot, React.org and MongoDB, also by 'awesome-compose' (see README.md) </p>  
            </header>   
        </div>
    )
}

export default App;