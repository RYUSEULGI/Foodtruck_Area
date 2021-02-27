import { FETCH_COMMUNITY_LIST, FETCH_COMMUNITY } from './mutation-types';
import axios from 'axios';

export default {
    fetchCommunityList ({ commit }){
        return axios.get('http://localhost:7777/communities')
        .then( res => {
            commit(FETCH_COMMUNITY_LIST, res.data);
        });
    },
    fetchCommunity ({ commit }){
        return axios.get(`http://localhost:7777/communities/${listNo}`)
        .then( res => {
            commit(FETCH_COMMUNITY, res.data);
        });
    }
}