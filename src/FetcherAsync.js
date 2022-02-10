import React from 'react';

/**
 * Class to async fetch, has the logic of state
 */
export default class FetcherAsync extends React.Component {
    constructor(props) {
      super(props);
  
      this.state = {
        data: null,
        error: null
      };
    }
  
    async componentDidMount() {
        try {

            const response = await fetch(this.props.url)
            if (!response.ok) {
                throw Error(response.statusText);
            }
            const json = await response.json();
            console.log(this.data)
            this.setState( {
              data: json
            })
        }
        catch( error ) {
            this.setState( {
                error
              })
        }
    }
  
    render() {
      return this.props.children(this.state);
    }
}