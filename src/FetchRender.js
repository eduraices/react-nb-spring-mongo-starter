import FetcherAsync from './FetcherAsync';

/**
 * Class to manage response objects from FetcherAsync component
 * @param {*} props 
 * @returns response data object and log messages
 */
export default function FetchRender (props) {
    
    return (
            <FetcherAsync url={ props.fetchUrl } >
                
                {({ data, error }) => {
                    if (!data) {
                        return <p>No data yet ...</p>;
                    }
                    if (error) {
                        return <p>{error.message}</p>;
                    }
                    return (
                        
                        props.children(data)
                    )
                }}
            </FetcherAsync>
    )
}