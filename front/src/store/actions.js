import { FETCH_COMMUNITY_LIST, FETCH_COMMUNITY } from './mutation-types';
import axios from 'axios';

export default {
    fetchCommunityList ({ commit }){
        return axios.get('http://localhost:7777/communities')
        .then( res => {
            commit(FETCH_COMMUNITY_LIST, res.data);
        });
    },
    fetchCommunity ({ commit, listNo }){
        console.log('fetchBoard ' + commit + ', boardNo = ' + listNo);
        return axios.get(`http://localhost:7777/communities/${listNo}`)
        .then( res => {
            console.log('res = ' + parseInt(res.data.randNumber));
            commit(FETCH_COMMUNITY, res.data);
        });
    }
}