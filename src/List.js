import './App.css';
import FetchRender from './FetchRender';


function List (props) {

    return (
        <FetchRender fetchUrl={"http://localhost:8080/api/publishings"} >
            { (data) => 
                <table className="inside-table dark-table">
                    <thead>
                        <tr>
                            <th className="dark-head">
                                Title
                            </th>
                            <th className="dark-head">
                                Language
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
                                    {item.alpha}
                                </td>
                            </tr>                                  
                        ))}
                    </tbody>
                </table> 
            }
        </FetchRender>
        
    )
}

export default List;