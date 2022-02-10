import './App.css';
import FetchRender from './FetchRender';
import List from './List';


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
                                                <List bookId={item.id} />
                                            </td>
                                        </tr>                                     
                                    ))}
                                    </tbody>
                                </table> }
                </FetchRender>    
            </header>   
        </div>
    )
}

export default App;