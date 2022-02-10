import './App.css';
import FetchRender from './FetchRender';

/**
 * Function component to get a list by props.fetchUrl and props.refId (reference to another table_id)
 * 
 * @param {*} props
 * @returns 
 */
function ReferencedList (props) {

    return (
        <FetchRender fetchUrl={props.fetchUrl + props.refId } >
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

export default ReferencedList;